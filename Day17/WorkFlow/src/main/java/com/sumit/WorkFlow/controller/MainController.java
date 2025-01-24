package com.sumit.WorkFlow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("updatecountry")
	public ResponseEntity<String> updateCountry(@RequestBody Country country) {
		String msg= service.updateCountry(country);
		return ResponseEntity.ok(msg);		
	}
	
	@DeleteMapping("deletecountry/{id}")
	public ResponseEntity<String> deleteCountry(@PathVariable Integer id){
		String msg= service.deleteCountry(id);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("getcountrybyid/{id}")
	public ResponseEntity<Country> getParticularCountryById(@PathVariable Integer id){
		Country country = service.getParticularCountryById(id);
		return ResponseEntity.ok(country);
	}
	
	@GetMapping("getallcountry")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> list=service.getAllCountry();
		return ResponseEntity.ok(list);
	}
	

}
