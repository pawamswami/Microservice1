package com.sbi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentsDto {

	private Long paymentId;
	private Long orderId;
	private Long userId;
	private Double totalAmount;
	private String status;
}
