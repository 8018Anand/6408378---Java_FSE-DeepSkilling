package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EntityScan("com.cognizant.orm_learn.model")
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCustomers();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = (CountryService)context.getBean(CountryService.class);
		testGetAllCountries();
		LOGGER.info("Main method started");
	}

}
