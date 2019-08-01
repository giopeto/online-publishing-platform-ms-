package com.opp.ratingsservice.V1.ratings;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/V1/ratings")
@AllArgsConstructor
public class RatingsController {

    @NonNull private final RatingsService ratingsService;

    @GetMapping
    public List<Ratings> get() {
        return ratingsService.get();
    }

    @PostMapping
    public Mono<Ratings> save(@RequestBody Ratings ratings) {
        return ratingsService.save(ratings);
    }
}
