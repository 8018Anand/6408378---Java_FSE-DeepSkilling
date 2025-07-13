package com.cognizant.Spring_learn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Spring_learn.Country;

@RestController
@RequestMapping("country")
public class CountryController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<?> getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country c = context.getBean(Country.class);
		return ResponseEntity.ok(c);
	}
}
