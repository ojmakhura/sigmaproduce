// Generated by andromda-angular cartridge (app\usecase\action.store.ts.vsl) DO NOT EDIT
import { createAction, props } from '@ngrx/store';

export enum CropActionType {
    CROP_RESET = '[Crop] Crop Reset',
    CROP_FAILURE = '[Crop] Crop Action Failure',
    CROP_LOADING = '[Crop] Crop Loading'
}


export const cropReset = createAction(CropActionType.CROP_RESET);

export const cropLoading = createAction(
    CropActionType.CROP_LOADING,
    props<{ loading: boolean, success: boolean, messages: any[] }>()
);

export const cropFailure = createAction(
    CropActionType.CROP_FAILURE,
    props<{ messages: any[] }>()
);