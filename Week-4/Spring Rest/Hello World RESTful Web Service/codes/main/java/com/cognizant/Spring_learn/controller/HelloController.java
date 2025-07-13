package com.cognizant.Spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	private static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@GetMapping("")
	public String sayHello() {
		LOGGER.info("Before Returing.....");
		LOGGER.info("Returing......");
		return "Hello World!!";
	}
}
