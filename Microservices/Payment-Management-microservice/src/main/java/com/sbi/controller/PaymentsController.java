package com.sbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.service.PaymentsService;

@RestController
public class PaymentsController {

	@Autowired
	PaymentsService service;
	
	@GetMapping(path = "/get/payment/{orderId}")
	public Double getPayment(@PathVariable String orderId) {
		return service.getPaymentValueOfAnOrder(orderId);
	}
	
	/*@GetMapping(path = "/get/payment/{orderId}")
	public Double getPayment(@PathVariable String orderId) {
		return service.getPaymentValueOfAnOrder(orderId);
	}*/
}
