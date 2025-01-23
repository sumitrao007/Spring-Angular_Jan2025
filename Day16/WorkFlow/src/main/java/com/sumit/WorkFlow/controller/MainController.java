package com.sumit.WorkFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.WorkFlow.entity.Country;
import com.sumit.WorkFlow.service.MainService;

@RestController
@RequestMapping("api")
public class MainController {
	
	@Autowired
	MainService service;
	
	@PostMapping("addcountry")
	public ResponseEntity<String> addCountry(@RequestBody Country country) {
		String msg= service.addCountry(country);
		return ResponseEntity.ok(msg);
	}
	

}
