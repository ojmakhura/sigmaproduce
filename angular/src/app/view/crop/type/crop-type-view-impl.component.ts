// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component } from '@angular/core';
import { CropTypeViewComponent } from '@app/view/crop/type/crop-type-view.component';
import { CropTypeViewVarsForm } from '@app/view/crop/type/crop-type-view.component';
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
import { CropTypeDetailsComponent } from '@app/components/crop/type/crop-type-details.component';
import { CropTypeEditorComponent } from '@app/components/crop/type/crop-type-editor.component';
import { CropTypeVO } from '@app/model/bw/co/sigmaproduce/crop/type/crop-type-vo';
import { Observable, Subscription } from 'rxjs';

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
    SharedModule,
    MaterialModule,
    CsvModule,
    CropTypeDetailsComponent,
    CropTypeEditorComponent,
  ],
})
export class CropTypeViewImplComponent extends CropTypeViewComponent {
  
  cropType$: Observable<CropTypeVO> = this.store.select(CropTypeSelectors.selectCropType);
  cropTypeSubscription: Subscription;

  constructor() {
    super();
  }

  override beforeOnInit(form: CropTypeViewVarsForm): CropTypeViewVarsForm {
    return form;
  }

  doNgOnDestroy(): void {
    if (this.cropTypeSubscription) {
      this.cropTypeSubscription.unsubscribe();
    }
  }
  
  override doNgAfterViewInit(): void {
    this.cropTypeSubscription = this.route.queryParams.subscribe((params: any) => {
      
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

    this.cropType$.subscribe((cropType) => {
      if (cropType) {
        
        this.cropTypeDetailsComponent?.idControl?.setValue(cropType.id);
        this.cropTypeDetailsComponent?.nameControl?.setValue(cropType.name);
        this.cropTypeDetailsComponent?.codeControl?.setValue(cropType.code);
        this.cropTypeDetailsComponent?.createdByControl?.setValue(cropType.createdBy);
        this.cropTypeDetailsComponent?.updatedByControl?.setValue(cropType.updatedBy);
        this.cropTypeDetailsComponent?.createdDateControl?.setValue(cropType.createdDate);
        this.cropTypeDetailsComponent?.updatedDateControl?.setValue(cropType.updatedDate);
        // this.cropTypeEditorComponent?.imagesControl?.setValue(cropType.images);
        this.cropTypeDetailsComponent?.descriptionControl?.setValue(cropType.description);
        this.cropTypeDetailsComponent?.numberOfCropsControl?.setValue(cropType.numberOfCrops);
        this.cropTypeDetailsComponent?.numberOfDiseasesControl?.setValue(cropType.numberOfDiseases);
        this.cropTypeDetailsComponent?.numberOfPestsControl?.setValue(cropType.numberOfPests);
        
      }
    });
  }
}