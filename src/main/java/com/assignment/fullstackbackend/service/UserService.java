package com.assignment.fullstackbackend.service;

import com.assignment.fullstackbackend.model.User;
import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
