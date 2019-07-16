package com.opp.articlesservice.V1.articles;

import lombok.NonNull;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/V1/articles")
public class ArticlesController {

    @NonNull private final  ArticlesService articlesService;

    public ArticlesController(@NonNull ArticlesService articlesService) {
        this.articlesService = articlesService;
    }

    @GetMapping
    public Flux<Articles> get() {
        return articlesService.get();
    }

    @PostMapping
    public Mono<Articles> save(@RequestBody Articles groups) {
        return articlesService.save(groups);
    }
}
