package com.assignment.fullstackbackend.controller;

import com.assignment.fullstackbackend.model.Card;
import com.assignment.fullstackbackend.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Marks this class as a REST controller, allowing it to handle HTTP requests.
@CrossOrigin // Enables cross-origin resource sharing (CORS) on all handler methods in this controller.
public class CardController {

    @Autowired // Automatically injects an instance of CardRepository into this controller.
    private CardRepository cardRepository;

    @PostMapping("/card") // Maps HTTP POST requests onto the newCard method for the path "/card".
    Card newCard(@RequestBody Card newCard) {
        // Accepts a Card object from the request body and saves it to the database.
        return cardRepository.save(newCard);
    }

    @GetMapping("/cards") // Maps HTTP GET requests onto the getAllCards method for the path "/cards".
    List<Card> getAllCards() {
        // Retrieves and returns a list of all Card entries from the database.
        return cardRepository.findAll();
    }
}
