// Generated by andromda-jsf cartridge (view\table\table-impl.component.ts.vsl)
import { Component } from '@angular/core';
import { SearchAuthorisationsCropsComponent } from '@app/view/crop/search-authorisations-crops.component';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { SharedModule } from '@app/@shared';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';

@Component({
  selector: 'app-search-authorisations-crops',
  templateUrl: './search-authorisations-crops.component.html',
  styleUrls: [ './search-authorisations-crops.component.scss' ],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    SharedModule,
    MaterialModule,
    CsvModule,
  ],
})
export class SearchAuthorisationsCropsImplComponent extends SearchAuthorisationsCropsComponent {

  constructor() {
    super();
  }

}