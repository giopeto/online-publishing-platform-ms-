package com.opp.ratingsservice.V1.ratings;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@AllArgsConstructor
public class RatingsServiceImpl implements RatingsService{

    @NonNull
    private final RatingsRepository ratingsRepository;

    @Override
    public Mono<Ratings> save(Ratings ratings) {
        return ratingsRepository.save(ratings);
    }

    @Override
    public List<Ratings> get() {
        return ratingsRepository.findAll().collectList().block();

    }
}
