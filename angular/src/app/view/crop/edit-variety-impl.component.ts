// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component, Inject } from '@angular/core';
import { EditVarietyComponent } from '@app/view/crop/edit-variety.component';
import { EditVarietyVarsForm } from '@app/view/crop/edit-variety.component';
import { CropState } from '@app/store/crop/crop.state';
import * as CropSelectors from '@app/store/crop/crop.selectors';
import * as CropActions from '@app/store/crop/crop.actions';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { CommonModule } from '@angular/common';
import { FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { SharedModule } from '@app/@shared';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { CropVarietyEditorComponent } from '@app/components/crop/varieties/crop-variety-editor.component';
import { CropVO } from '@app/model/bw/co/roguesystems/sigma/crop/crop-vo';

@Component({
  selector: 'app-edit-variety',
  templateUrl: './edit-variety.component.html',
  styleUrls: ['./edit-variety.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    SharedModule,
    MaterialModule,
    CsvModule,
    CropVarietyEditorComponent,
  ],
})
export class EditVarietyImplComponent extends EditVarietyComponent {
  constructor(@Inject(MAT_DIALOG_DATA) data: any) {
    super(data);
  }

  override beforeOnInit(form: EditVarietyVarsForm): EditVarietyVarsForm {
    return form;
  }

  doNgOnDestroy(): void {}

  override afterOnInit(): void {
    this.cropVarietyEditorForm = this.cropVarietyControl;
    this.cropVarietyVarietyControl.addControl('crop', this.createCropVOGroup(new CropVO()));
  }

  createCropVOGroup(value: CropVO): FormGroup {
    return this.formBuilder.group({
      id: [value?.id],
      createdBy: [value?.createdBy],
      updatedBy: [value?.updatedBy],
      createdDate: [value?.createdDate],
      updatedDate: [value?.updatedDate],
      code: [value?.code],
      name: [value?.name],
    });
  }
}
