import { Injectable } from '@angular/core';

import { Articles } from 'src/app/shared/models/articles';
import { API_BASE_URL } from 'src/app/shared/ApiConstants';
import { HttpService } from './http.service';

@Injectable({
  providedIn: 'root'
})
export class ArticlesService {
  
  private apiUrl = `${API_BASE_URL}/articles`;

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
