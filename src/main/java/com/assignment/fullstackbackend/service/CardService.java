package com.assignment.fullstackbackend.service;

import com.assignment.fullstackbackend.model.Card;

import java.util.List;

public interface CardService {

    public Card savecard(Card card);
    public List<Card> getAllCards();

}
