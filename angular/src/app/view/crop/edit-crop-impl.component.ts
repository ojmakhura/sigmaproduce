// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { EditCropComponent } from '@app/view/crop/edit-crop.component';
import { EditCropVarsForm } from '@app/view/crop/edit-crop.component';
import { CropState } from '@app/store/crop/crop.state';
import * as CropSelectors from '@app/store/crop/crop.selectors';
import * as CropActions from '@app/store/crop/crop.actions';
import * as CropTypeSelectors from '@app/store/crop/type/crop-type.selectors';
import * as CropTypeActions from '@app/store/crop/type/crop-type.actions';
import { MatRadioChange } from '@angular/material/radio';
import { MatCheckboxChange } from '@angular/material/checkbox';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateModule } from '@ngx-translate/core';
import { SharedModule } from '@app/@shared';
import { MaterialModule } from '@app/material.module';
import { CsvModule } from '@ctrl/ngx-csv';
import { EditVarietyImplComponent } from '@app/view/crop/edit-variety-impl.component';
import { CropEditorComponent } from '@app/components/crop/crop-editor.component';
import { CropVarietyEditorComponent } from '@app/components/crop/varieties/crop-variety-editor.component';
import { CropVO } from '@app/model/bw/co/sigmaproduce/crop/crop-vo';

@Component({
  selector: 'app-edit-crop',
  templateUrl: './edit-crop.component.html',
  styleUrls: ['./edit-crop.component.scss'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    TranslateModule,
    SharedModule,
    MaterialModule,
    CsvModule,
    EditVarietyImplComponent,
    CropEditorComponent,
    CropVarietyEditorComponent,
  ],
})
export class EditCropImplComponent extends EditCropComponent {
  constructor() {
    super();
    this.cropTypes$ = this.store.select(CropTypeSelectors.selectCropTypes);
  }

  override beforeOnInit(form: EditCropVarsForm): EditCropVarsForm {
    return form;
  }

  doNgOnDestroy(): void {}

  override get editCropSaveCrop(): CropVO {

    let crop = new CropVO();

    crop.id = this.cropComponent?.idControl?.value;
    crop.name = this.cropComponent?.nameControl?.value;
    crop.code = this.cropComponent?.codeControl?.value;
    crop.createdBy = this.cropComponent?.createdByControl?.value;
    crop.updatedBy = this.cropComponent?.updatedByControl?.value;
    crop.createdDate = this.cropComponent?.createdDateControl?.value;
    crop.updatedDate = this.cropComponent?.updatedDateControl?.value;
    crop.type = this.cropComponent?.typeControl?.value;
    crop.description = this.cropComponent?.descriptionControl?.value;
    crop.images = this.cropComponent?.imagesControl?.value;
    crop.maturesIn = this.cropComponent?.maturesInControl?.value;
    crop.maturityPeriod = this.cropComponent?.maturityPeriodControl?.value;
    
    return crop;
  }

  override doNgAfterViewInit(): void {
    this.store.dispatch(CropTypeActions.getAll({ loading: true, loaderMessage: 'Loading...' }));

    this.cropTypes$.subscribe((cropTypes) => {

      if(this.cropComponent) {

        this.cropComponent.typeBackingList = [];
        this.cropType
        console.log(cropTypes);
        cropTypes.forEach((cropType) => {
          this.cropComponent?.typeBackingList.push({ value: cropType.id, label: cropType.name });
        });

      }
    });
  }

  override beforeEditCropSave(form: any): void {
    console.log(form);

    this.store.dispatch(
      CropActions.save({
        crop: form.crop,
        loading: true,
        loaderMessage: 'Saving...',
      })
    );

  }
}
