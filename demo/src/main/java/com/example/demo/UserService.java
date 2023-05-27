package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        // Wykonaj ewentualną dodatkową walidację lub logikę biznesową

        // Zapisz użytkownika w bazie danych
        userRepository.save(user);
    }
}


