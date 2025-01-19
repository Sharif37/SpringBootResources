package com.example.restapi;

import com.example.restapi.utility.EnvironmentUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        EnvironmentUtil.get("DB_USERNAME");
        SpringApplication.run(RestApiApplication.class, args);
    }



}
