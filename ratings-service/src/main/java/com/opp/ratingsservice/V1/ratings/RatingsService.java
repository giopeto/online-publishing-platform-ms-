package com.opp.ratingsservice.V1.ratings;

import reactor.core.publisher.Mono;

import java.util.List;

public interface RatingsService {

    Mono<Ratings> save(Ratings ratings);

    List<Ratings> get();

}
