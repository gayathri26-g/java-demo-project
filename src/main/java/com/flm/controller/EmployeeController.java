package com.flm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("hello() called - returning Hello World");
        return "Hello World";
    }
}
