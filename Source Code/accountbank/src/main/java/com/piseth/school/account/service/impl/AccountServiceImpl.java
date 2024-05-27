package com.piseth.school.account.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.piseth.school.account.entity.Account;
import com.piseth.school.account.repository.AccountRepository;
import com.piseth.school.account.service.AccountService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

	private final AccountRepository AccountRepository;

	@Override
	public Account save(Account Account) {

		return AccountRepository.save(Account);

	}

	@Override
	public List<Account> getAccounts() {
		return AccountRepository.findAll();
	}

	@Override
	public Account getById(Long id) {
		return AccountRepository.findById(id).
				orElseThrow(()-> new RuntimeException("Account not found"));
	}

}
