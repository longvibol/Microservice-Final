package com.piseth.card.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piseth.card.entity.Card;
import com.piseth.card.repository.CardRepository;
import com.piseth.card.service.CardService;

@Service
public class CardServiceImpl implements CardService{
	
	@Autowired
	private CardRepository cardRepository;

	@Override
	public Card save(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public List<Card> getList() {
		return cardRepository.findAll();
	}

	@Override
	public List<Card> getByCustomerId(Long customerId) {
		return cardRepository.findByCustomerId(customerId);
		
	}

}
