package com.example.apigee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApigeeApplication {

	@Value("${GET_ORDERS_URL}")
	private String GET_ORDERS_URL;

	@Value("${GET_PRODUCTS_OFFER_URL}")
	private String GET_PRODUCTS_OFFER_URL;

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		//@formatter:off
		return builder.routes()
				.route(p -> p.path("/orders")
						.uri(GET_ORDERS_URL))
				.route(p -> p.path("/products")
						.uri(GET_PRODUCTS_OFFER_URL))
				.build();
		//@formatter:on
	}

	public static void main(String[] args) {
		SpringApplication.run(ApigeeApplication.class, args);
	}
}
