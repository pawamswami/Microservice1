 package com.kotak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kotak.dto.OrderDetailsDto;
import com.kotak.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService service;
	
	@GetMapping("/orders/{userId}")
	public List<OrderDetailsDto> getAllOrders(@PathVariable String userId){
		System.out.println("helllllsjjsjs");
		return service.getAllOrders(userId);
	}
}
