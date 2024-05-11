// Generated by andromda-angular cartridge (service\service.impl.ts.vsl) CAN EDIT
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CropVO } from '@app/model/bw/co/roguesystems/sigma/crop/crop-vo';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CropApi {
    
    protected path = 'crop';

    constructor(private http: HttpClient) {
    }

    public findById(id: string | any ): Observable<CropVO | any> {

        return this.http.get<CropVO | any>(this.path + `/${id}`);

    }

    public getAll(): Observable<CropVO[] | any[]> {

        return this.http.get<CropVO[] | any[]>(this.path + `/all`);

    }

    public getAllPaged(pageNumber: number | any , pageSize: number | any ): Observable<Page<CropVO> | any> {

        return this.http.get<Page<CropVO> | any>(this.path + `/page/${pageNumber}/size/${pageSize}`);

    }

    public pagedSearch(pageNumber: number | any , pageSize: number | any , criteria: string | any ): Observable<Page<CropVO> | any> {

        return this.http.post<Page<CropVO> | any>(this.path + `/search/page/${pageNumber}/size/${pageSize}`, {pageNumber: pageNumber, pageSize: pageSize, criteria: criteria});

    }

    public remove(id: string | any ): Observable<boolean | any> {

        return this.http.delete<boolean | any>(this.path + `/${id}`);

    }

    public save(crop: CropVO | any ): Observable<CropVO | any> {

        return this.http.post<CropVO | any>(this.path, crop);

    }

    public search(criteria: string | any ): Observable<CropVO[] | any[]> {

        return this.http.post<CropVO[] | any[]>(this.path + `/search`, criteria);

    }

}
