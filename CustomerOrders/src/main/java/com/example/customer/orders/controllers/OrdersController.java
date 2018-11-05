package com.example.customer.orders.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.orders.response.OrderDetails;

@RestController
public class OrdersController {
	
	@Value("${default.string: No message}")
	private String message;

	@GetMapping("/orders")
	public ResponseEntity<List<OrderDetails>> getProducts() {
		
		OrderDetails productDetails = new OrderDetails();
		productDetails.setAvailableQty(10);
		productDetails.setDescription("Product description");
		productDetails.setId(1);
		productDetails.setName("Mac Pro");
		productDetails.setPrice(70000);

		OrderDetails productDetails1 = new OrderDetails();
		productDetails1.setAvailableQty(10);
		productDetails1.setDescription("Product description");
		productDetails1.setId(1);
		productDetails1.setName("Mac Pro");
		productDetails1.setPrice(70000);

		return new ResponseEntity<>(Arrays.asList(productDetails, productDetails1), HttpStatus.OK);
	}
}
