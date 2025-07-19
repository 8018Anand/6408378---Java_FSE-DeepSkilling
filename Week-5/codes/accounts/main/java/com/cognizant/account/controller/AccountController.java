package com.cognizant.account.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts/")
public class AccountController {
	@GetMapping("{number}/")
	public ResponseEntity<?> getEmployeeByNumber(@PathVariable String number) {
	    Map<String, Object> response = new HashMap<>();
	    response.put("number", "00987987973432");
	    response.put("type", "savings");
	    response.put("balance", 234343);

	    return ResponseEntity.ok(response);
	}	
}
