package com.orderservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@GetMapping("/user/{userId}")
	public List<String> getOrdersByUser(@PathVariable String userId) {
		return List.of("Order1 for " + userId, "Order2 for " + userId);
	}
}
