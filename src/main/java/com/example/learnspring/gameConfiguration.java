package com.example.learnspring;

import com.example.restapi.basicGame.GameRunner;
import com.example.restapi.basicGame.GamingConsole;
import com.example.restapi.basicGame.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class gameConfiguration {

    @Bean
    public  GamingConsole game(){
        var game = new PacManGame();
        return game;
    }


    @Bean
    GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }

   }
