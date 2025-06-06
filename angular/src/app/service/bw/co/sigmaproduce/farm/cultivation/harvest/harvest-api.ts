// Generated by andromda-angular cartridge (service\service.impl.ts.vsl) CAN EDIT
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { HarvestDTO } from '@app/model/bw/co/sigmaproduce/farm/cultivation/harvest/harvest-dto';
import { HarvestList } from '@app/model/bw/co/sigmaproduce/farm/cultivation/harvest/harvest-list';
import { HarvestCriteria } from '@app/model/bw/co/sigmaproduce/farm/cultivation/harvest/harvest-criteria';
import { HttpClient } from '@angular/common/http';
import { Page } from '@app/model/page.model';
import { SearchObject } from '@app/model/search-object';

@Injectable({
  providedIn: 'root'
})
export class HarvestApi {
    
    protected path = '/farm/cultivation/harvest';

    private http = inject(HttpClient);

    public findById(id: string | any ): Observable<HarvestDTO | any> {

        return this.http.get<HarvestDTO | any>(`${this.path}/${id}`);
    }

    public getAll(): Observable<HarvestList[] | any[]> {

        return this.http.get<HarvestList[] | any[]>(`${this.path}`);
    }

    public getAllPaged(pageNumber: number | any , pageSize: number | any ): Observable<Page<HarvestList> | any> {

        return this.http.get<Page<HarvestList> | any>(`${this.path}/page/${pageNumber}/size/${pageSize}`);
    }

    public pagedSearch(criteria: HarvestCriteria | any , pageNumber: number | any , pageSize: number | any ): Observable<Page<HarvestList> | any> {

        return this.http.post<Page<HarvestList> | any>(`${this.path}/search/page/${pageNumber}/size/${pageSize}`, {criteria: criteria, pageNumber: pageNumber, pageSize: pageSize});
    }

    public remove(id: string | any ): Observable<boolean | any> {

        return this.http.delete<boolean | any>(`${this.path}/${id}`);
    }

    public save(harvest: HarvestDTO | any ): Observable<HarvestDTO | any> {

        return this.http.post<HarvestDTO | any>(`${this.path}`, harvest);
    }

    public search(criteria: HarvestCriteria | any ): Observable<HarvestList[] | any[]> {

        return this.http.post<HarvestList[] | any[]>(`${this.path}/search`, criteria);
    }

}
