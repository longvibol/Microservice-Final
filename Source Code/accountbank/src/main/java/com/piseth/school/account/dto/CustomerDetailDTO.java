package com.piseth.school.account.dto;

import java.util.List;

import lombok.Data;


@Data
public class CustomerDetailDTO {

//	ពត៌មានដែលយើងនឹង return មក	
	private CustomerDTO customer;
	private List<CardResponseDTO> cards;
	private List<LoanResponseDTO> loans;
	
}
