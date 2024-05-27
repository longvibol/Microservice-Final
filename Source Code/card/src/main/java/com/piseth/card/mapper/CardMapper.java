package com.piseth.card.mapper;

import org.springframework.stereotype.Component;

import com.piseth.card.dto.CardDTO;
import com.piseth.card.entity.Card;

//@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
@Component
//public interface CardMapper {

public class CardMapper {		

public Card toCard(CardDTO dto) {
	
	Card card = new Card();
	card.setAmountUsed(dto.getAmountUsed());
	card.setAvailableAmount(dto.getAvailableAmount());
	card.setCardId(dto.getCardId());
	card.setCardNumber(dto.getCardNumber());
	card.setCardType(dto.getCardType());
	card.setCreateDate(dto.getCreateDate());
	card.setCustomerId(dto.getCustomerId());
	card.setTotalLimit(dto.getTotalLimit());
	card.setAmountUsed(dto.getAmountUsed());
	
	
	return card;
};

}
