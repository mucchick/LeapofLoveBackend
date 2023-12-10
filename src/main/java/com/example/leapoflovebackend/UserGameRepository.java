package com.example.leapoflovebackend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserGameRepository extends MongoRepository<UserGame, String> {
    // Here, you can define custom query methods if needed.
    // For example:
    UserGame findByUserId(String userId);
}
