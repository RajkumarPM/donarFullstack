package com.assignment.fullstackbackend.service;
import com.assignment.fullstackbackend.model.Card;
import com.assignment.fullstackbackend.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardServiceImpl implements  CardService{
    @Autowired
    private CardRepository cardRepository;



    @Override
    public Card savecard(Card card) {
        return cardRepository.save(card);
    }


    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

}
