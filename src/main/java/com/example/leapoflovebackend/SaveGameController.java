package com.example.leapoflovebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class SaveGameController {

    private final UserGameService userGameService;

    @Autowired
    public SaveGameController(UserGameService userGameService) {
        this.userGameService = userGameService;
    }


    @PostMapping("/save")
    public ResponseEntity<?> saveGame(@RequestBody UserGame userGame) {
        try {
            UserGame savedGame = userGameService.saveOrUpdateUserGame(userGame);
            String responseMessage = "Game successfully saved with data: UserId = " + savedGame.userId
                    + ", GameData = " + savedGame.gameData.toString();
            return ResponseEntity.ok(responseMessage);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to save game data: " + e.getMessage());
        }
    }
}
