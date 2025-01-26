package com.example.restapi.basicGame;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
    public void  up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("sit down");
    }
    public void left(){
        System.out.println("Go back!");
    }

    public void right(){
        System.out.println("shoot a bullet!");
    }

}
