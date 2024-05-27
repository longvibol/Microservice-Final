package com.piseth.school.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piseth.school.account.entity.Account;


public interface AccountRepository extends JpaRepository<Account, Long>{

	
}
