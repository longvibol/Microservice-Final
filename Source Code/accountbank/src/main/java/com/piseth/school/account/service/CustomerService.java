package com.piseth.school.account.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piseth.school.account.entity.Customer;

@Component
public interface CustomerService {

	Customer save(Customer customer);
	List<Customer> getCustomers();
	Customer getById(Long id);
}
