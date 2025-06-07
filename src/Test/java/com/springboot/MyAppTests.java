package com.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyAppTests {

    @Test
    void contextLoads() {
        // This will run when the Spring context is loaded
        System.out.println("Spring Boot: Test Case Running ");
    }
}
