import { Injectable } from '@angular/core';

import { Articles } from 'src/app/shared/models/articles';
import { getApiBaseUrl } from 'src/app/shared/ApiConstants';
import { HttpService } from './http.service';

@Injectable({
  providedIn: 'root'
})
export class ArticlesService {
  
  private apiUrl = getApiBaseUrl('articles') + `/articles`;

  constructor(private httpService: HttpService) { }

  get() {
    return this.httpService.get(this.apiUrl);
  }

  save(article: Articles) {
    return this.httpService.post(this.apiUrl, article);
  }

  deleteAll() {
    return this.httpService.delete(this.apiUrl);
  }
}
