package com.opp.articlesservice.V1.articles;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ArticlesRepository extends ReactiveMongoRepository<Articles, String> {
}
