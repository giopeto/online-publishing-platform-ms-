package com.opp.ratingsservice.V1.ratings;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingsRepository extends ReactiveCrudRepository<Ratings, String> {
}
