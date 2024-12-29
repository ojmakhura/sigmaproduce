// Generated by andromda-angular cartridge (service\service.impl.ts.vsl) CAN EDIT
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { CropTypeVO } from '@app/model/bw/co/sigmaproduce/crop/type/crop-type-vo';
import { HttpClient } from '@angular/common/http';
import { Page } from '@app/model/page.model';
import { SearchObject } from '@app/model/search-object';

@Injectable({
  providedIn: 'root'
})
export class CropTypeApi {
    
    protected path = '/crop/type';

    private http = inject(HttpClient);

    public findById(id: string | any ): Observable<CropTypeVO | any> {

        return this.http.get<CropTypeVO | any>(this.path + `/${id}`);
    }

    public getAll(): Observable<CropTypeVO[] | any[]> {

        return this.http.get<CropTypeVO[] | any[]>(this.path);
    }

    public remove(id: string | any ): Observable<boolean | any> {

        return this.http.delete<boolean | any>(this.path + `/${id}`);
    }

    public save(cropType: CropTypeVO | any ): Observable<CropTypeVO | any> {

        return this.http.post<CropTypeVO | any>(this.path, cropType);
    }

    public search(criteria: string | any ): Observable<CropTypeVO[] | any[]> {

        return this.http.post<CropTypeVO[] | any[]>(this.path + `/search?criteria=${criteria}`, criteria);
    }

}