import { Component, OnInit, Input } from '@angular/core';
import { RatingsService } from 'src/app/core/services/ratings.service';
import { Ratings } from 'src/app/shared/models/ratings';

@Component({
  selector: 'app-ratings',
  templateUrl: './ratings.component.html',
  styleUrls: ['./ratings.component.css']
})
export class RatingsComponent implements OnInit {

  @Input() articleId: String;
  
  constructor(private ratingsService: RatingsService) { }

  ngOnInit() {
  }

  saveRating(rating: number) {
    this.ratingsService.saveRating({articleId: this.articleId, rating}).subscribe();
  }

}
