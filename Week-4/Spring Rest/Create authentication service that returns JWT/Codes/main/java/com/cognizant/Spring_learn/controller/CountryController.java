package com.cognizant.Spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Spring_learn.Country;
import com.cognizant.Spring_learn.service.CountryService;

@RestController
@RequestMapping("/country/")
public class CountryController {
	@Autowired
	CountryService countryService;
	
	@GetMapping("")
	public ResponseEntity<?> getCountryIndia() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country c = context.getBean(Country.class);
		return ResponseEntity.ok(c);
	}
	@GetMapping("/{code}")
	public Country getCountry(@PathVariable String code) {		
		Country country = countryService.getCountry(code);
		return country;
	}
}
