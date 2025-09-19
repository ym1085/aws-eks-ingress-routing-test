package com.eks.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestModuleDependency {

    public void testDependency() {
        log.info("Success load dependency test class..");
    }
}