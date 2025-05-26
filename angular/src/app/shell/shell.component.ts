import Keycloak from 'keycloak-js';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Component, inject, OnInit } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { CommonModule } from '@angular/common';
import { MaterialModule } from '@app/material.module';
import { TranslateModule } from '@ngx-translate/core';
import * as nav from './navigation';
import { LanguageSelectorComponent } from '@app/i18n/language-selector.component';
import { AppEnvStore } from '@app/store/app-env.state';

@Component({
  selector: 'app-shell',
  templateUrl: './shell.component.html',
  styleUrls: ['./shell.component.scss'],
  imports: [CommonModule, TranslateModule, MaterialModule, RouterModule, LanguageSelectorComponent],
})
export class ShellComponent implements OnInit {
  menus: any[] = [];
  keycloak = inject(Keycloak);
  protected appEnvState = inject(AppEnvStore);
  constructor(
    private titleService: Title,
    private breakpoint: BreakpointObserver,
  ) {}

  ngOnInit() {
    this.menus = nav.menuItems;
  }

  logout() {
    console.log('logout');
    this.keycloak.logout();
  }

  get isMobile(): boolean {
    return this.breakpoint.isMatched(Breakpoints.Small) || this.breakpoint.isMatched(Breakpoints.XSmall);
  }

  get title(): string {
    return this.titleService.getTitle();
  }
}
