package com.example.restapi.basicGame;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole Game;
    public GameRunner(@Qualifier("marioGame") GamingConsole Game) {
        this.Game=Game ;

    }

    public void run() {
        System.out.println("Game started: "+ Game);
        Game.up();
        Game.down();
        Game.left();
        Game.right();


    }
}
