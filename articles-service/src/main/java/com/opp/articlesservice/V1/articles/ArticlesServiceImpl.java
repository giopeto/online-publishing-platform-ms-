package com.opp.articlesservice.V1.articles;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
@AllArgsConstructor
public class ArticlesServiceImpl implements ArticlesService {

    @NonNull private final ArticlesRepository articlesRepository;

    @Override
    public Mono<Articles> save(Articles articles) {
        try {
            articles.setName(articles.getName() + InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

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
