package com.opp.articlesservice.V1.ratings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ratings {

    private String id;
    private String articleId;
    private int rating;
}
