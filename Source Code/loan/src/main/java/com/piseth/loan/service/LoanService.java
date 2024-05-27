package com.piseth.loan.service;

import java.util.List;

import com.piseth.loan.entity.Loan;


public interface LoanService {
	
	Loan save(Loan loan);
	List<Loan> getList();
	List<Loan> getByCustomerId(Long customerId);

}
