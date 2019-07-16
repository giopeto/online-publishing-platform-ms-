package com.opp.articlesservice.V1.articles;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService{

    @NonNull private final ArticlesRepository articlesRepository;

    public ArticlesServiceImpl(@NonNull ArticlesRepository articlesRepository) {
        this.articlesRepository = articlesRepository;
    }

    @Override
    public Mono<Articles> save(Articles articles) {
        return articlesRepository.save(articles);
    }

    @Override
    public Flux<Articles> get() {
        //Flux<Articles> result = articlesRepository.findAll();

        return articlesRepository.findAll();
    }
}
