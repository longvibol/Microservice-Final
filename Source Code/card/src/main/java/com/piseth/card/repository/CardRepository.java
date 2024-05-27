package com.piseth.card.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.piseth.card.entity.Card;

public interface CardRepository extends MongoRepository<Card, Long>{
	
	List<Card> findByCustomerId(Long customerId);

}
