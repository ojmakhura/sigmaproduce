// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { EditCropTypeComponent } from '@app/view/crop/type/edit-crop-type.component';
import { EditCropTypeVarsForm } from '@app/view/crop/type/edit-crop-type.component';
import { CropTypeState } from '@app/store/crop/type/crop-type.state';
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
import { CropTypeEditorComponent } from '@app/components/crop/type/crop-type-editor.component';
import { CropTypeVO } from '@app/model/bw/co/sigmaproduce/crop/type/crop-type-vo';
import { Observable, Subscription } from 'rxjs';

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
    SharedModule,
    MaterialModule,
    CsvModule,
    CropTypeEditorComponent,
  ],
})
export class EditCropTypeImplComponent extends EditCropTypeComponent {

  cropType$: Observable<CropTypeVO> = this.store.select(CropTypeSelectors.selectCropType);
  cropTypeSubscription: Subscription;

  constructor() {
    super();
  }

  override beforeOnInit(form: EditCropTypeVarsForm): EditCropTypeVarsForm {
    return form;
  }

  doNgOnDestroy(): void {
    if (this.cropTypeSubscription) {
      this.cropTypeSubscription.unsubscribe();
    }
  }

  /**
   * This method may be overwritten
   */
  override get editCropTypeSaveCropType(): CropTypeVO {
    let cropType = new CropTypeVO();
    cropType.id = this.cropTypeEditorComponent?.idControl?.value;
    cropType.name = this.cropTypeEditorComponent?.nameControl?.value;
    cropType.code = this.cropTypeEditorComponent?.codeControl?.value;
    cropType.createdBy = this.cropTypeEditorComponent?.createdByControl?.value;
    cropType.updatedBy = this.cropTypeEditorComponent?.updatedByControl?.value;
    cropType.createdDate = this.cropTypeEditorComponent?.createdDateControl?.value;
    cropType.updatedDate = this.cropTypeEditorComponent?.updatedDateControl?.value;
    cropType.images = this.cropTypeEditorComponent?.imagesControl?.value;
    cropType.description = this.cropTypeEditorComponent?.descriptionControl?.value;

    return cropType;
  }

  override beforeEditCropTypeSave(form: any): void {

    this.store.dispatch(
      CropTypeActions.save({
        cropType: form.cropType,
        loading: true,
        loaderMessage: 'Saving...',
      })
    );
  }

  override doNgAfterViewInit(): void {
    this.route.queryParams.subscribe((params: any) => {
      
      if (params.id) {
        this.store.dispatch(
          CropTypeActions.findById({
            id: params.id,
            loading: true,
            loaderMessage: 'Loading...',
          })
        );
      }
    });

    this.cropTypeSubscription = this.cropType$.subscribe((cropType) => {
      if (cropType) {
        console.log(this.cropTypeEditorForm)
        this.cropTypeEditorComponent?.idControl?.setValue(cropType.id);
        this.cropTypeEditorComponent?.nameControl?.setValue(cropType.name);
        this.cropTypeEditorComponent?.codeControl?.setValue(cropType.code);
        this.cropTypeEditorComponent?.createdByControl?.setValue(cropType.createdBy);
        this.cropTypeEditorComponent?.updatedByControl?.setValue(cropType.updatedBy);
        this.cropTypeEditorComponent?.createdDateControl?.setValue(cropType.createdDate);
        this.cropTypeEditorComponent?.updatedDateControl?.setValue(cropType.updatedDate);
        // this.cropTypeEditorComponent?.imagesControl?.setValue(cropType.images);
        this.cropTypeEditorComponent?.descriptionControl?.setValue(cropType.description);
        console.log(this.cropTypeEditorForm)
      }
    });
  }
}
