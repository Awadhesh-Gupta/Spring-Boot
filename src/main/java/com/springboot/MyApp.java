package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        System.out.println("==== Spring Boot is starting ====");
        SpringApplication.run(MyApp.class, args);
    }
}
