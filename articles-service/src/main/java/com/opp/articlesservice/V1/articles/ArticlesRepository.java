package com.opp.articlesservice.V1.articles;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ArticlesRepository extends ReactiveCrudRepository<Articles, String> {
}
