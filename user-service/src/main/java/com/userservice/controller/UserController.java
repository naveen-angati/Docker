package com.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.service.OrderClient;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private OrderClient orderClient;

	@GetMapping("/{userId}/orders")
	public List<String> getUserOrders(@PathVariable String userId) {
		System.out.println("user-service {} Entry getUserOrders() method");
		List<String> orders =  orderClient.getOrdersForUser(userId);
		System.out.println("user-service {} Exit getUserOrders() method");
		return orders;
	}
	
	@GetMapping("/user")
	public String getUserData() {
		return "Hi, Naveen How are you";
	}
}
