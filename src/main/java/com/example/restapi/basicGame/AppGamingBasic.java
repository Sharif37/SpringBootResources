package com.example.restapi.basicGame;

import com.example.learnspring.gameConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class AppGamingBasic {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register( AppGamingBasic.class );
        context.refresh();
        context.getBean(GameRunner.class).run();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        context.close();




    }
}
