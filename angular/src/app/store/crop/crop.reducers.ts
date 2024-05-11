// Generated by andromda-angular cartridge (app\usecase\reducer.store.ts.vsl) DO NOT EDIT
import { Action, createFeature, createReducer, on } from '@ngrx/store';
import * as CropActions from './crop.actions';
import {cropKey, initialState} from './crop.state';

export const cropReducer = createReducer(
    initialState,
    on(CropActions.cropReset, (state) => ({
      ...state,
        criteria: null, 
        id: null, 
        crops: [], 
        crop: null, 
        loading: false,
        success: false,
        error: false,
        messges: []
    })),
    on(CropActions.cropFailure, (state, action) => ({
        ...state,
        loading: false,
        success: false,
        error: true,
        messages: action.messages
    })),
    on(CropActions.cropLoading, (state, action) => ({
        ...state,
        loading: action.loading,
        success: false
    }))
);

export const cropFeature = createFeature({
    name: cropKey,
    reducer: cropReducer
});