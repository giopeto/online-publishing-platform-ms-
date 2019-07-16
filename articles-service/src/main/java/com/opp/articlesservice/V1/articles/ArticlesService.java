package com.opp.articlesservice.V1.articles;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ArticlesService {

    Mono<Articles> save(Articles groups);

    Flux<Articles> get();
}
