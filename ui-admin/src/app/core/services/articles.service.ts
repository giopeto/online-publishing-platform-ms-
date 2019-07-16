import { Injectable } from '@angular/core';
import { Articles } from 'src/app/shared/models/articles';
import { HttpClient } from '@angular/common/http';

import { API_BASE_URL, HTTP_OPTIONS } from 'src/app/shared/ApiConstants';

@Injectable({
  providedIn: 'root'
})
export class ArticlesService {
  
  private apiUrl = `${API_BASE_URL}/articles`;

  constructor(private http: HttpClient) { }

  save(article: Articles) {
    return this.http.post<Articles>(`${this.apiUrl}`, article, HTTP_OPTIONS);
  }
}
