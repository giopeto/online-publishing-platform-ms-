import { Injectable } from '@angular/core';
import { Ratings } from 'src/app/shared/models/ratings';
import { HttpService } from './http.service';
import { getApiBaseUrl } from 'src/app/shared/ApiConstants';


@Injectable({
  providedIn: 'root'
})
export class RatingsService {

  private apiUrl = getApiBaseUrl('ratings') + `/ratings`;
  
  constructor(private httpService: HttpService) { }

  saveRating(rating: Ratings) {
    return this.httpService.post(this.apiUrl, rating);
  }
}
