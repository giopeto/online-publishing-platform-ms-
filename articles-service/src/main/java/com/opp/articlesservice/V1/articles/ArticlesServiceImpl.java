package com.opp.articlesservice.V1.articles;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ArticlesServiceImpl implements ArticlesService {

    @NonNull private final ArticlesRepository articlesRepository;

    @Override
    public Mono<Articles> save(Articles articles) {
        return articlesRepository.save(articles);
    }

    @Override
    public Flux<Articles> get() {
        return articlesRepository.findAll();
    }

    @Override
    public Disposable deleteAll() {
        return articlesRepository.deleteAll().subscribe();
    }
}
