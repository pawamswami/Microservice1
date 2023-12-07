package com.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.entity.Payments;
import com.sbi.repository.PaymentRepository;

@Service
public class PaymentsService {
	
	@Autowired
	PaymentRepository repository;

	public Double getPaymentValueOfAnOrder(String orderId) {
		Payments payments =repository.findByOrderId(Long.valueOf(orderId));
		return payments.getTotalAmount();
	}

}
