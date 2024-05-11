// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SharedModule } from '@app/@shared';
import { MaterialModule } from '@app/material.module';
import { SearchAuthorisationsCropsImplComponent } from '@app/view/crop/search-authorisations-crops-impl.component';
import { SearchAuthorisationsComponent, SearchAuthorisationsVarsForm } from '@app/view/crop/search-authorisations.component';
import { CsvModule } from '@ctrl/ngx-csv';
import { TranslateModule } from '@ngx-translate/core';

@Component({
  selector: 'app-search-authorisations',
  templateUrl: './search-authorisations.component.html',
  styleUrls: ['./search-authorisations.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    SharedModule,
    MaterialModule,
    CsvModule,
    SearchAuthorisationsCropsImplComponent,
  ],
})
export class SearchAuthorisationsImplComponent extends SearchAuthorisationsComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: SearchAuthorisationsVarsForm): SearchAuthorisationsVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}