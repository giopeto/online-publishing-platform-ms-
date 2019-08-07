package com.opp.articlesservice.V1.articles;

import com.opp.articlesservice.V1.ratings.RatingsClient;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
@AllArgsConstructor
@Slf4j
public class ArticlesServiceImpl implements ArticlesService {

    @NonNull
    private final ArticlesRepository articlesRepository;

    @NonNull
    private final RatingsClient ratingsClient;

    @Autowired
    private DiscoveryClient discoveryClient;

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


        log.info("XXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXXXXXXXXX discoveryClient.getServices(): {}", discoveryClient.getServices());

        ratingsClient.getAllRatings().stream().forEach(ratings -> System.out.println("Rating: " + ratings.toString()));

        log.info("All ratings: {}", ratingsClient.getAllRatings().toString());
        return articlesRepository.findAll();
    }

    @Override
    public Disposable deleteAll() {
        return articlesRepository.deleteAll().subscribe();
    }
}
