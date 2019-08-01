package com.opp.articlesservice.V1.articles;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ArticlesService {

    Mono<Articles> save(Articles articles);

    Flux<Articles> get();

    Disposable deleteAll();
}
