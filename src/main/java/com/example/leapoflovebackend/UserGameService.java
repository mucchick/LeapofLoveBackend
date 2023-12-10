package com.example.leapoflovebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserGameService {
    private final UserGameRepository repository;

    @Autowired
    public UserGameService(UserGameRepository repository) {
        this.repository = repository;
    }

    public UserGame saveOrUpdateUserGame(UserGame userGame) {
        return repository.save(userGame);
    }

    public UserGame getUserGame(String userId) {
        return repository.findByUserId(userId);
    }
}




