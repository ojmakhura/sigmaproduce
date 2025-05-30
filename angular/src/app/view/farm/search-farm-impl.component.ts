// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { SearchFarmComponent } from '@app/view/farm/search-farm.component';
import { SearchFarmVarsForm } from '@app/view/farm/search-farm.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';

import { TableComponent } from '@app/components/table/table.component';
import { LoaderComponent } from "@shared/loader/loader.component";
import { FarmSearchImplComponent } from '@app/components/farm/farm-search-impl.component';

@Component({
  selector: 'app-search-farm',
  templateUrl: './search-farm.component.html',
  styleUrls: ['./search-farm.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,

    TableComponent,
    LoaderComponent,
    FarmSearchImplComponent,
  ],
})
export class SearchFarmImplComponent extends SearchFarmComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: SearchFarmVarsForm): SearchFarmVarsForm{
        return form;
    }

    doNgOnDestroy(): void {
    }
}
