package com.assignment.fullstackbackend.service;

import com.assignment.fullstackbackend.model.User;
import com.assignment.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Indicates that this class is a Spring service component.
public class UserServiceImpl implements UserService {

    @Autowired // Automatically injects an instance of UserRepository into this service.
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        // Saves a User object to the database using the injected UserRepository.
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        // Retrieves and returns a list of all User objects from the database using the injected UserRepository.
        return userRepository.findAll();
    }
}
