package com.example.customer.products.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.products.response.ProductDetails;

@RestController
public class ProductsController {
	
	@Value("${default.string: No message}")
	private String message;

	@GetMapping("/offers")
	public ResponseEntity<List<ProductDetails>> getProducts() {
		
		ProductDetails productDetails = new ProductDetails();
		productDetails.setAvailableQty(10);
		productDetails.setDescription("Product description");
		productDetails.setId(1);
		productDetails.setName("Mac Pro");
		productDetails.setPrice(70000);

		ProductDetails productDetails1 = new ProductDetails();
		productDetails1.setAvailableQty(10);
		productDetails1.setDescription("Product description");
		productDetails1.setId(1);
		productDetails1.setName("Mac Pro");
		productDetails1.setPrice(70000);

		return new ResponseEntity<>(Arrays.asList(productDetails, productDetails1), HttpStatus.OK);
	}
}
