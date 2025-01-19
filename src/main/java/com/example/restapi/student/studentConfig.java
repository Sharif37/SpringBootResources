package com.example.restapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            studentRepository studentRepository) {
        return args -> {

            student kazi = new student( "kazi", "male", LocalDate.of(2000, Month.DECEMBER, 31), "1 no gate", "01832944519", "kazi.csecu@gmail.com");
            student omar = new student( "omar",  "male", LocalDate.of(2000, Month.DECEMBER, 31), "1 no gate", "01832944519", "omar.csecu@gmail.com");
            student sharif = new student( "sharif",  "male", LocalDate.of(2000, Month.DECEMBER, 31), "1 no gate", "01832944519", "sharif.csecu@gmail.com");
            studentRepository.saveAll(
                    List.of(kazi, omar, sharif)
            );


        };
    }
}
