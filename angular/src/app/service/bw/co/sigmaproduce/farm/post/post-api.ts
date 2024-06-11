// Generated by andromda-angular cartridge (service\service.impl.ts.vsl) CAN EDIT
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PostVO } from '@app/model/bw/co/sigmaproduce/farm/post/post-vo';
import { Post } from '@app/${import.filePath}';
import { HttpClient } from '@angular/common/http';
import { Page } from '@app/model/page.model';

@Injectable({
  providedIn: 'root'
})
export class PostApi {
    
    protected path = '/farm/post';

    constructor(private http: HttpClient) {
    }

    public findById(id: string | any ): Observable<PostVO | any> {

        return this.http.get<PostVO | any>(this.path + `/${id}`);

    }

    public findFarmPosts(farmId: string | any ): Observable<Post[] | any[]> {

        return this.http.get<Post[] | any[]>(this.path + `/byFarm`);

    }

    public findFarmPostsPaged(farmId: string | any , pageSize: number | any , pageNumber: number | any ): Observable<Page<PostVO> | any> {

        return this.http.get<Page<PostVO> | any>(this.path + `/byFarm/paged`);

    }

    public getAll(): Observable<PostVO[] | any[]> {

        return this.http.get<PostVO[] | any[]>(this.path);

    }

    public remove(id: string | any ): Observable<boolean | any> {

        return this.http.delete<boolean | any>(this.path + `/${id}`);

    }

    public save(post: PostVO | any ): Observable<PostVO | any> {

        return this.http.post<PostVO | any>(this.path, post);

    }

    public search(criteria: string | any ): Observable<PostVO[] | any[]> {

        return this.http.get<PostVO[] | any[]>(this.path + `/search`);

    }

}
