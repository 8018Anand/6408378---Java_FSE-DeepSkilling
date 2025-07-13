package com.cognizant.Spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	String name;
	String code;
	
	private static Logger LOGGER;
	public Country() {
		LOGGER = LoggerFactory.getLogger(Country.class);
		LOGGER.info("Inside Country Constructor.");
	}

	public String getName() {
		LOGGER.info("getName() called.");
		return name;
	}

	public void setName(String name) {
		LOGGER.info("setName() called.");
		this.name = name;
	}

	public String getCode() {
		LOGGER.info("getCode() called.");
		return code;
	}

	public void setCode(String code) {
		LOGGER.info("setCode() called.");
		this.code = code;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + "]";
	}
	
	
}
