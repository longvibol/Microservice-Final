package com.piseth.school.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMessageDTO {
	
	private long customerId;
	private String name;
	private String email;
	private String mobileNumber;

}
