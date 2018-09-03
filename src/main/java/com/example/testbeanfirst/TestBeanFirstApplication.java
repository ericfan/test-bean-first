package com.example.testbeanfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestBeanFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestBeanFirstApplication.class, args);
    }
}
