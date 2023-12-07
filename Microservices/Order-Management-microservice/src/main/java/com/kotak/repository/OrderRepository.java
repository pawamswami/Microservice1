package com.kotak.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kotak.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	

	List<Order> findByUserId(Integer valueOf);

}
