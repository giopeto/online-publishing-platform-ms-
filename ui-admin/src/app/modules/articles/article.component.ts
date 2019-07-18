import { Component, OnInit } from '@angular/core';
import { ArticlesService } from 'src/app/core/services/articles.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Articles } from 'src/app/shared/models/articles';

@Component({
  selector: 'app-articles',
  templateUrl: './articles.component.html',
  styleUrls: ['./articles.component.css']
})
export class ArticlesComponent implements OnInit {
  
  articlesForm: FormGroup;
  article: Articles = { name: '', body: '' };
  articles: Articles[];

  constructor(private articlesService: ArticlesService, private formBuilder: FormBuilder) { 
    this.buildForm(this.article);
  }

  ngOnInit(): void {
    this.get();
  }

  get() {
    this.articlesService.get().subscribe(data => this.articles = data as Articles[]);
  }

  save(article: Articles) {
    this.articlesService.save(article).subscribe(() => this.get());
  }

  buildForm(article: Articles) {
    this.articlesForm = this.formBuilder.group({
      'name' : [article.name, Validators.required],
      'body' : [article.body, Validators.required],
			'validate' : ''
		});
  }

}
