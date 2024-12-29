// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component, Inject } from '@angular/core';
import { EditCultivationComponent } from '@app/view/farm/edit-cultivation.component';
import { EditCultivationVarsForm } from '@app/view/farm/edit-cultivation.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { TableComponent } from '@app/components/table/table.component';
import { LoaderComponent } from "@shared/loader/loader.component";
import { CultivationEditorImplComponent } from '@app/components/farm/cultivation/cultivation-editor-impl.component';

@Component({
  selector: 'app-edit-cultivation',
  templateUrl: './edit-cultivation.component.html',
  styleUrls: ['./edit-cultivation.component.scss'],
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
    CultivationEditorImplComponent,
  ],
})
export class EditCultivationImplComponent extends EditCultivationComponent {

    constructor(@Inject(MAT_DIALOG_DATA) data: any) {
        super(data);
    }

    override beforeOnInit(form: EditCultivationVarsForm): EditCultivationVarsForm{     
        return form;
    }

    doNgOnDestroy(): void {
    }
}