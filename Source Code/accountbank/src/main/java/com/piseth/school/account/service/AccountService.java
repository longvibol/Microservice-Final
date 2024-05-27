package com.piseth.school.account.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piseth.school.account.entity.Account;
import com.piseth.school.account.entity.Customer;

@Component
public interface AccountService {

	Account save(Account account);
	List<Account> getAccounts();
	Account getById(Long id);
}
