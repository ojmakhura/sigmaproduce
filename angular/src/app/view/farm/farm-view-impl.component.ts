// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { FarmViewComponent } from '@app/view/farm/farm-view.component';
import { FarmViewVarsForm } from '@app/view/farm/farm-view.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { LoaderComponent } from "@shared/loader/loader.component";
import { FarmDetailsImplComponent } from '@app/components/farm/farm-details-impl.component';

@Component({
  selector: 'app-farm-view',
  templateUrl: './farm-view.component.html',
  styleUrls: ['./farm-view.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,
    CsvModule,
    TableComponent,
    LoaderComponent,
    FarmDetailsImplComponent,
  ],
})
export class FarmViewImplComponent extends FarmViewComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: FarmViewVarsForm): FarmViewVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}