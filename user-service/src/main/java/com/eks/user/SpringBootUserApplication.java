package com.eks.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.eks")
public class SpringBootUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserApplication.class, args);
    }
}
