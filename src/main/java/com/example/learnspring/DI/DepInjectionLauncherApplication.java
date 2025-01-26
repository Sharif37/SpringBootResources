package com.example.learnspring.DI;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//Business class
//dependencies1
//dependencies2

/*
there are 3 type of dependencies injection
1. field injection
2. setter  based injection
3. constructor based injection
 */
@Component
class YourBusinessClass{
    //Field Injection
    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;



    @Override
    public String toString() {
        return "Using"+"dependency1="+dependency1+",dependency2="+dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DepInjectionLauncherApplication.class);
        context.refresh();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(YourBusinessClass.class));
        context.close();

    }
}
