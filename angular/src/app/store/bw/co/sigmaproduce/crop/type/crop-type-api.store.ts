
import { inject } from '@angular/core';
import { patchState, signalStore, withMethods, withState } from '@ngrx/signals';
import { rxMethod } from '@ngrx/signals/rxjs-interop';
import { switchMap } from 'rxjs';
import { tapResponse } from '@ngrx/operators';
import { AppState } from '@app/store/app-state';
import { SearchObject } from '@app/model/search-object';
import { Page } from '@app/model/page.model';
import { CropTypeVO } from '@app/model/bw/co/sigmaproduce/crop/type/crop-type-vo';
import { CropTypeApi } from '@app/service/bw/co/sigmaproduce/crop/type/crop-type-api';

const initialState: AppState<any, any> = {
  data: null,
  dataList: [],
  dataPage: new Page<any>(),
  searchCriteria: new SearchObject<any>(),
  error: null,
  loading: false,
  success: false,
  messages: [],
  loaderMessage: ''
};

export const CropTypeApiStore = signalStore(
  { providedIn: 'root' },
  withState(initialState),
  withMethods((store: any) => {
    const cropTypeApi = inject(CropTypeApi);
    return {
      reset: () => {
        patchState(store, initialState);
      },
      findById: rxMethod<{id: string | any }>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return cropTypeApi.findById(data.id, ).pipe(
            tapResponse({
              next: (data: CropTypeVO | any) => {
                //patchState(
                  //store, 
                  // { 
                  //    data, 
                  //    loading: false, 
                  //    error: false,
                  //    success: true, 
                  //    messages: [] 
                  //}
                //);
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      getAll: rxMethod<void>(
        switchMap(() => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return cropTypeApi.getAll().pipe(
            tapResponse({
              next: (data: CropTypeVO[] | any[]) => {
                //patchState(
                  //store, 
                  // { 
                  //    data, 
                  //    loading: false, 
                  //    error: false,
                  //    success: true, 
                  //    messages: [] 
                  //}
                //);
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      remove: rxMethod<{id: string | any }>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return cropTypeApi.remove(data.id, ).pipe(
            tapResponse({
              next: (data: boolean | any) => {
                //patchState(
                  //store, 
                  // { 
                  //    data, 
                  //    loading: false, 
                  //    error: false,
                  //    success: true, 
                  //    messages: [] 
                  //}
                //);
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      save: rxMethod<{cropType: CropTypeVO | any }>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return cropTypeApi.save(data.cropType, ).pipe(
            tapResponse({
              next: (data: CropTypeVO | any) => {
                //patchState(
                  //store, 
                  // { 
                  //    data, 
                  //    loading: false, 
                  //    error: false,
                  //    success: true, 
                  //    messages: [] 
                  //}
                //);
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
      search: rxMethod<{criteria: string | any }>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return cropTypeApi.search(data.criteria, ).pipe(
            tapResponse({
              next: (data: CropTypeVO[] | any[]) => {
                //patchState(
                  //store, 
                  // { 
                  //    data, 
                  //    loading: false, 
                  //    error: false,
                  //    success: true, 
                  //    messages: [] 
                  //}
                //);
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    error, 
                    loading: false, 
                    success: false,
                    messages: [error?.error ? error.error : error] 
                  }
                );
              },
            }),
          );
        }),
      ),
    }
  }),
);
