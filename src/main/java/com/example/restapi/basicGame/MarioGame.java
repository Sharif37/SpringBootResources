package com.example.restapi.basicGame;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void  up(){
        System.out.println("Jumping!");
    }
    public void down(){
        System.out.println("Go into a hole");
    }
    public void left(){
        System.out.println("Go back!");
    }

    public void right(){
        System.out.println("Accelerate!");
    }

}
