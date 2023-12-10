package com.example.leapoflovebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class LoadGameController {

    private final UserGameService userGameService;

    @Autowired
    public LoadGameController(UserGameService userGameService) {
        this.userGameService = userGameService;
    }

    @GetMapping("/load/{userId}")
    public ResponseEntity<?> loadGame(@PathVariable String userId) {
        try {
            UserGame userGame = userGameService.getUserGame(userId);
            if (userGame == null) {
                // If the user is new and no game data exists, return a default state or an indicator
                return ResponseEntity.ok("New User - No Saved Game Data");
                // Alternatively, return a default UserGame object if that's more appropriate
            }
            return ResponseEntity.ok(userGame);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to load game data: " + e.getMessage());
        }
    }
}

