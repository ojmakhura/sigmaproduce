// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { CropTypeViewComponent } from '@app/view/crop/type/crop-type-view.component';
import { CropTypeViewVarsForm } from '@app/view/crop/type/crop-type-view.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { LoaderComponent } from "@shared/loader/loader.component";
import { CropTypeDetailsImplComponent } from '@app/components/crop/type/crop-type-details-impl.component';
import { CropTypeEditorImplComponent } from '@app/components/crop/type/crop-type-editor-impl.component';

@Component({
  selector: 'app-crop-type-view',
  templateUrl: './crop-type-view.component.html',
  styleUrls: ['./crop-type-view.component.scss'],
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
    CropTypeDetailsImplComponent,
    CropTypeEditorImplComponent,
  ],
})
export class CropTypeViewImplComponent extends CropTypeViewComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: CropTypeViewVarsForm): CropTypeViewVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}