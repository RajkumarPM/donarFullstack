package com.assignment.fullstackbackend.controller;

import com.assignment.fullstackbackend.model.User;
import com.assignment.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Marks this class as a REST controller, allowing it to handle HTTP requests.
@CrossOrigin // Enables cross-origin resource sharing (CORS) on all handler methods in this controller.
public class UserController {

    @Autowired // Automatically injects an instance of UserRepository into this controller.
    private UserRepository userRepository;

    @PostMapping("/user")
        // Maps HTTP POST requests onto the newUser method for the path "/user".
    User newUser(@RequestBody User newUser) {
        // Accepts a User object from the request body and saves it to the database.
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
        // Maps HTTP GET requests onto the getAllUsers method for the path "/users".
    List<User> getAllUsers() {
        // Retrieves and returns a list of all User entries from the database.
        return userRepository.findAll();
    }


}
