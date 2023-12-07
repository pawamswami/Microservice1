package com.kotak.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotak.dto.OrderDetailsDto;
import com.kotak.entity.Order;
import com.kotak.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;

	public List<OrderDetailsDto> getAllOrders(String userId) {
		List<Order> orders = repository.findByUserId(Integer.valueOf(userId));
		
		List<OrderDetailsDto> allorders = new ArrayList<>();
		
		for (Order order : orders) {
		OrderDetailsDto dto	=OrderDetailsDto.builder().amount(order.getAmount())
			.userId(order.getUserId())
			.orderId(order.getOrderId())
			.noOfItems(order.getNoOfItems()).build();
		
		allorders.add(dto);
		}
		return allorders;
	}
}
