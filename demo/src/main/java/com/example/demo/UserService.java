package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        // Perform any additional validation or business logic here

        // Save the user to the database
        userRepository.save(user);
    }
}

