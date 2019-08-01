package com.opp.articlesservice.V1.ratings;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "opp-ratings-svc")
public interface RatingsClient {


    @GetMapping("/api/V1/ratings")
    List<Ratings> getAllRatings();
}
