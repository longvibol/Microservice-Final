package com.piseth.card.service;

import java.util.List;

import com.piseth.card.entity.Card;


public interface CardService {
	
	Card save(Card card);
	List<Card> getList();
	
	List<Card> getByCustomerId(Long customerId);

}
