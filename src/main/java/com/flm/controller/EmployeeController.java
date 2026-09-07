package com.flm.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EmployeeController {

	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello Employee";
	    }
}
