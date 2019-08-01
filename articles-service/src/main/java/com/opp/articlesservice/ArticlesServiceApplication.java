package com.opp.articlesservice;

import com.opp.articlesservice.V1.articles.Articles;
import com.opp.articlesservice.V1.articles.ArticlesService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class ArticlesServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(ArticlesServiceApplication.class, args);
	}


	/* Init logic */
	@NonNull
	private final ArticlesService articlesService;

	public ArticlesServiceApplication(@NonNull ArticlesService articlesService) {
		this.articlesService = articlesService;
	}

	@PostConstruct
	private void init() {
		System.out.println("YYYYYYYYYYYYYYYYYYYYYYYY sysout YYYYYYYYYYYYYYYYYYYYYYYYYYY");
		log.info("=====================================> Init ArticlesServiceApplication <=====================================");

		Articles articles = new Articles();
		articles.setName("name");
		articles.setBody("body");

		log.info("articlesService.save(articles): " + articlesService.save(articles));
		articlesService.save(articles);
		log.info("All articles: " + articlesService.get());
		log.info("=====================================> Init ArticlesServiceApplication end <=====================================");
	}
	/* Init logic */
}
