package com.eks.order;

import com.eks.common.TestModuleDependency;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.eks")
public class SpringBootOrderApplication {

    private final TestModuleDependency dependencyTest;

    @Autowired
    public SpringBootOrderApplication(TestModuleDependency dependencyTest) {
        this.dependencyTest = dependencyTest;
    }

    @PostConstruct
    public void init() {
        dependencyTest.testDependency();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrderApplication.class, args);
    }
}