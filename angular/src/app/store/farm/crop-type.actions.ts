// Generated by andromda-angular cartridge (app\usecase\action.store.ts.vsl) DO NOT EDIT
import { createAction, props } from '@ngrx/store';

export enum CropTypeActionType {
    CROP_TYPE_RESET = '[CropType] CropType Reset',
    CROP_TYPE_FAILURE = '[CropType] CropType Action Failure',
    CROP_TYPE_LOADING = '[CropType] CropType Loading'
}


export const cropTypeReset = createAction(CropTypeActionType.CROP_TYPE_RESET);

export const cropTypeLoading = createAction(
    CropTypeActionType.CROP_TYPE_LOADING,
    props<{ loading: boolean, success: boolean, messages: any[] }>()
);

export const cropTypeFailure = createAction(
    CropTypeActionType.CROP_TYPE_FAILURE,
    props<{ messages: any[] }>()
);
