import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HTTP_OPTIONS } from 'src/app/shared/ApiConstants';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  

  constructor(private http: HttpClient) { }

  get(apiUrl: string) {
    return this.http.get(apiUrl, HTTP_OPTIONS);
  }

  post(apiUrl: string, payload) {
    return this.http.post(apiUrl, payload, HTTP_OPTIONS);
  }
}
