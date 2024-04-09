package com.assignment.fullstackbackend.controller;
import com.assignment.fullstackbackend.model.Login;
import com.assignment.fullstackbackend.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping("/login") // Change the endpoint to /login
    public ResponseEntity<Login> login(@RequestBody Login loginDetails) {
        // Retrieve the user from the database based on the entered username
        Login user = loginRepository.findByUsername(loginDetails.getUsername());

        // Check if the user exists and the password matches
        if (user != null && user.getPassword().equals(loginDetails.getPassword())) {
            return ResponseEntity.ok(user); // Return user object on successful login
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null); // Return unauthorized status if login fails
        }
    }
    @GetMapping("/lets")
        // Maps HTTP GET requests onto the getAllUsers method for the path "/users".
    List<Login> getAllUsers() {
        // Retrieves and returns a list of all User entries from the database.
        return loginRepository.findAll();
    }
}
