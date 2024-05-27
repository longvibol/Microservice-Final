package com.piseth.loan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piseth.loan.entity.Loan;
import com.piseth.loan.repository.LoanRepository;
import com.piseth.loan.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService{
	
	@Autowired
	private LoanRepository loanRepository;

	@Override
	public Loan save(Loan loan) {
		return loanRepository.save(loan);
	}

	@Override
	public List<Loan> getList() {
		return loanRepository.findAll();
	}

	@Override
	public List<Loan> getByCustomerId(Long customerId) {
		return loanRepository.findByCustomerId(customerId);
	}

}
