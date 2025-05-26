import { AppEnvState, AppEnvStore } from './store/app-env.state';
import Keycloak from 'keycloak-js';
import { Component, effect, inject, OnDestroy, OnInit } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { ActivatedRoute, NavigationEnd, Router, RouterModule, RouterOutlet } from '@angular/router';
import { TranslateService } from '@ngx-translate/core';
import { merge } from 'rxjs';
import { filter, map, switchMap } from 'rxjs/operators';

import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { environment } from '@env/environment';
import { MaterialModule } from './material.module';
import { ShellComponent } from './shell/shell.component';
import { I18nService } from './i18n/i18n.service';
import { Logger } from './@shared';
import { KEYCLOAK_EVENT_SIGNAL, KeycloakEventType, ReadyArgs, typeEventArgs } from 'keycloak-angular';

const log = new Logger('App');

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  imports: [CommonModule, RouterOutlet, RouterModule, FormsModule, MaterialModule, ShellComponent],
})
export class AppComponent implements OnInit, OnDestroy {
  router = inject(Router);
  activatedRoute = inject(ActivatedRoute);
  private titleService = inject(Title);
  private translateService = inject(TranslateService);
  private i18nService = inject(I18nService);
  private appEnvState = inject(AppEnvStore);
  private keycloak = inject(Keycloak);
  private keycloakSignal = inject(KEYCLOAK_EVENT_SIGNAL);

  constructor() {

    effect(() => {
      const keycloakEvent = this.keycloakSignal();

      console.log('Keycloak event:', keycloakEvent);
      // this.keycloakStatus = keycloakEvent.type;

      if (keycloakEvent.type === KeycloakEventType.Ready) {
        this.appEnvState.setIsLoggedIn(typeEventArgs<ReadyArgs>(keycloakEvent.args));
        this.keycloak.loadUserProfile().then((profile) => {
          console.log('User profile:', profile);
          this.appEnvState.setUsername(profile.username || '');

        });
      }

      if (keycloakEvent.type === KeycloakEventType.AuthLogout) {
        this.appEnvState.setIsLoggedIn(false);
        this.appEnvState.setUsername(null);
        this.appEnvState.setAccountUri(null);
      }
    })
  }

  ngOnInit() {
    // Setup logger
    if (environment.production) {
      Logger.enableProductionMode();
    }

    log.debug('init');

    // Setup translations
    this.i18nService.init(environment.defaultLanguage, environment.supportedLanguages);

    const onNavigationEnd = this.router.events.pipe(filter((event) => event instanceof NavigationEnd));

    // Change page title on navigation or language change, based on route data
    merge(this.translateService.onLangChange, onNavigationEnd)
      .pipe(
        map(() => {
          let route = this.activatedRoute;
          while (route.firstChild) {
            route = route.firstChild;
          }
          return route;
        }),
        filter((route) => route.outlet === 'primary'),
        switchMap((route) => route.data),
      )
      .subscribe((event) => {
        const title = event['title'];
        if (title) {
          this.titleService.setTitle(this.translateService.instant(title));
        }
      });
  }

  ngOnDestroy() {
    this.i18nService.destroy();
  }
}
