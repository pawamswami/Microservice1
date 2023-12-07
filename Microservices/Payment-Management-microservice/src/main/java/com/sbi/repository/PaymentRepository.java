package com.sbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbi.entity.Payments;

public interface PaymentRepository extends JpaRepository<Payments, Long>{

	Payments findByOrderId(Long valueOf);

}
