package com.piseth.bank.message.function;

import lombok.Data;

@Data
public class CustomerMessageDTO {
	
	private long customerId;
	private String name;
	private String email;
	private String mobileNumber;

}
