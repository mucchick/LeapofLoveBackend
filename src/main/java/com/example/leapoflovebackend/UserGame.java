package com.example.leapoflovebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Document
public class UserGame {
    @Id
    public String userId;
    public GameData gameData;


    @Override
    public String toString() {
        return "UserGame{" +
                "userId='" + userId + '\'' +
                ", gameData=" + gameData +
                '}';
    }

    public static class GameData {
        private float x, y, velocityX, velocityY;

        public GameData() {
            // No-arg constructor
        }


        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float getVelocityX() {
            return velocityX;
        }

        public void setVelocityX(float velocityX) {
            this.velocityX = velocityX;
        }

        public float getVelocityY() {
            return velocityY;
        }

        public void setVelocityY(float velocityY) {
            this.velocityY = velocityY;
        }

        @Override
        public String toString() {
            return "GameData{" +
                    "x=" + x +
                    ", y=" + y +
                    ", velocityX=" + velocityX +
                    ", velocityY=" + velocityY +
                    '}';
        }
    }
}


