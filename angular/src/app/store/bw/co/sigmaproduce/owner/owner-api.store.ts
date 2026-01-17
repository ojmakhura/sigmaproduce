
import { inject } from '@angular/core';
import { patchState, signalStore, withMethods, withState } from '@ngrx/signals';
import { rxMethod } from '@ngrx/signals/rxjs-interop';
import { switchMap } from 'rxjs';
import { tapResponse } from '@ngrx/operators';
import { AppState } from '@app/store/app-state';
import { SearchObject } from '@models/search-object';
import { Page } from '@models/page.model';
import { OwnerDTO } from '@app/models/bw/co/sigmaproduce/owner/owner-dto';
import { OwnerListDTO } from '@app/models/bw/co/sigmaproduce/owner/owner-list-dto';
import { OwnerApi } from '@app/services/bw/co/sigmaproduce/owner/owner-api';

export type OwnerApiState = AppState<any, any> & {};

const initialState: OwnerApiState = {
  data: null,
  dataList: [],
  dataPage: new Page<any>(),
  searchCriteria: new SearchObject<any>(),
  loading: false,
  success: false,
  messages: [],
  loaderMessage: '',
  error: false
};

export const OwnerApiStore = signalStore(
  { providedIn: 'root' },
  withState(initialState),
  withMethods((store: any) => {
    const ownerApi = inject(OwnerApi);
    return {
      reset: () => {
        patchState(store, initialState);
      },
      findById: rxMethod<{id: string}>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return ownerApi.findById(data.id, ).pipe(
            tapResponse({
              next: (response: OwnerDTO) => {
                patchState(
                  store, 
                  {
                    data: response,
                    loading: false, 
                    success: true, 
                    messages: ['Success!!'],
                    error: false,
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    status: (error?.status || 0), 
                    loading: false, 
                    success: false,
                    error: true,
                    messages: [error.message || 'An error occurred'], 
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
          return ownerApi.getAll().pipe(
            tapResponse({
              next: (response: OwnerListDTO[]) => {
                patchState(
                  store, 
                  {
                    dataList: response, 
                    loading: false, 
                    success: true, 
                    messages: ['Success!!'],
                    error: false,
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    status: (error?.status || 0), 
                    loading: false, 
                    success: false,
                    error: true,
                    messages: [error.message || 'An error occurred'], 
                  }
                );
              },
            }),
          );
        }),
      ),
      remove: rxMethod<{id: string}>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return ownerApi.remove(data.id, ).pipe(
            tapResponse({
              next: (response: boolean) => {
                patchState(
                  store, 
                  {
                    data: response,
                    loading: false, 
                    success: true, 
                    messages: ['Success!!'],
                    error: false,
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    status: (error?.status || 0), 
                    loading: false, 
                    success: false,
                    error: true,
                    messages: [error.message || 'An error occurred'], 
                  }
                );
              },
            }),
          );
        }),
      ),
      save: rxMethod<{owner: OwnerDTO}>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return ownerApi.save(data.owner, ).pipe(
            tapResponse({
              next: (response: OwnerDTO) => {
                patchState(
                  store, 
                  {
                    data: response,
                    loading: false, 
                    success: true, 
                    messages: ['Success!!'],
                    error: false,
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    status: (error?.status || 0), 
                    loading: false, 
                    success: false,
                    error: true,
                    messages: [error.message || 'An error occurred'], 
                  }
                );
              },
            }),
          );
        }),
      ),
      search: rxMethod<{criteria: string}>(
        switchMap((data: any) => {
          patchState(store, { loading: true, loaderMessage: 'Loading ...' });
          return ownerApi.search(data.criteria, ).pipe(
            tapResponse({
              next: (response: OwnerListDTO[]) => {
                patchState(
                  store, 
                  {
                    dataList: response, 
                    loading: false, 
                    success: true, 
                    messages: ['Success!!'],
                    error: false,
                  }
                );
              },
              error: (error: any) => {
                patchState(
                  store, { 
                    status: (error?.status || 0), 
                    loading: false, 
                    success: false,
                    error: true,
                    messages: [error.message || 'An error occurred'], 
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
