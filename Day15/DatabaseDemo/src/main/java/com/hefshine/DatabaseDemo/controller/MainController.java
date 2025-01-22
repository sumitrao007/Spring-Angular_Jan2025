package com.hefshine.DatabaseDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.DatabaseDemo.entity.Person;
import com.hefshine.DatabaseDemo.service.MainService;

@RestController
@RequestMapping("api")
public class MainController {
	
	@Autowired
	MainService service;
	
	@PostMapping("addrecord")
	public String addRecord(@RequestBody Person p) {
		String msg= service.addRecord(p);
		return msg;
	}
	
	@PutMapping("updaterecord/{id}")
	public String updateRecord(@RequestBody Person p,@PathVariable Integer id) {
		String msg= service.updateRecord(p,id);
		return msg;
	}
	
	@GetMapping("getparticulardata/{id}")
	public Person getParticularRecordById(@PathVariable Integer id) {
		
		Person p= service.getParticularRecordById(id);
		return p;
		
	}
	
	@DeleteMapping("deletedata/{id}")
	public String deleteData(@PathVariable Integer id) {
		String msg=service.deleteData(id);
		return msg;
		
	}
	
	@GetMapping("getallrecord")
	public List<Person> getAllRecord() {
		List<Person> list= service.getAllRecord();
		return list;
	}
	
	@GetMapping("get-record-by-mobile/{mobileno}")
	public Person getRecordByMobileNo(@PathVariable String mobileno) {
		
		Person p= service.getRecordByMobileNo(mobileno);
		return p;
		
	}
	
	

}
