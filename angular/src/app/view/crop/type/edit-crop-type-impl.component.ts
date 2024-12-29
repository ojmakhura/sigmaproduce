// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { EditCropTypeComponent } from '@app/view/crop/type/edit-crop-type.component';
import { EditCropTypeVarsForm } from '@app/view/crop/type/edit-crop-type.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { LoaderComponent } from "@shared/loader/loader.component";
import { CropTypeEditorImplComponent } from '@app/components/crop/type/crop-type-editor-impl.component';

@Component({
  selector: 'app-edit-crop-type',
  templateUrl: './edit-crop-type.component.html',
  styleUrls: ['./edit-crop-type.component.scss'],
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
    CropTypeEditorImplComponent,
  ],
})
export class EditCropTypeImplComponent extends EditCropTypeComponent {

    constructor() {
        super();
    }

    override beforeOnInit(form: EditCropTypeVarsForm): EditCropTypeVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}