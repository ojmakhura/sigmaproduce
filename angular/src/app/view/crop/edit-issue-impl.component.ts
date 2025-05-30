// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component, Inject } from '@angular/core';
import { EditIssueComponent } from '@app/view/crop/edit-issue.component';
import { EditIssueVarsForm } from '@app/view/crop/edit-issue.component';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { MaterialModule } from '@app/material.module';

import { TableComponent } from '@app/components/table/table.component';
import { LoaderComponent } from "@shared/loader/loader.component";
import { CropIssueEditorImplComponent } from '@app/components/crop/issue/crop-issue-editor-impl.component';

@Component({
  selector: 'app-edit-issue',
  templateUrl: './edit-issue.component.html',
  styleUrls: ['./edit-issue.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    MaterialModule,

    TableComponent,
    LoaderComponent,
    CropIssueEditorImplComponent,
  ],
})
export class EditIssueImplComponent extends EditIssueComponent {

    constructor(@Inject(MAT_DIALOG_DATA) data: any) {
        super(data);
    }

    override beforeOnInit(form: EditIssueVarsForm): EditIssueVarsForm{
        return form;
    }

    doNgOnDestroy(): void {
    }
}
