package com.SLF4J_Trail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());
	public static void main(String[] args) {
		logger.info("Using logger to log the data");
		logger.warn("this is simple warning");
		logger.error("The is simple error");
		logger.trace("printing the trace");
		
		
	}
}
