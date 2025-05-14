package com.userservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client-service")
public interface OrderClient {

	@GetMapping("/orders/user/{userId}")
	List<String> getOrdersForUser(@PathVariable("userId") String userId);
}
