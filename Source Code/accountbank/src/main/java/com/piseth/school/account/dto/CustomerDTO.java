package com.piseth.school.account.dto;

import lombok.Data;

@Data
public class CustomerDTO {
	private Long customerNumber;
	private String name;
	private String email;
	private String mobileNumber;
	private String createDate;
}
