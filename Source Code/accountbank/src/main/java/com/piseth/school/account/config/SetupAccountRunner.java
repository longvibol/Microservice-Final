package com.piseth.school.account.config;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.piseth.school.account.entity.Account;
import com.piseth.school.account.entity.Customer;
import com.piseth.school.account.repository.AccountRepository;
import com.piseth.school.account.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
@RequiredArgsConstructor
public class SetupAccountRunner implements CommandLineRunner{
	
	private final CustomerRepository customerRepository;
	private final AccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {	
		

		Customer customer = new Customer();
		customer.setCreateDate(LocalDate.now());
		customer.setEmail("vibollong@gmail.com");
		customer.setMobileNumber("099 8888 8888");
		customer.setName("Vibol Long");
		
		//we want to save the customer and account to DB
		
		customerRepository.save(customer);
		
		Account account = new Account();
		account.setAccountNumber(1L);
		account.setAccountType("Saving");
		account.setBranchAddress("Phnom Penh");
		account.setCreateDate(LocalDate.now());
		account.setCustomer(customer);
		accountRepository.save(account);
		log.debug("Account create");
		
	}

}
