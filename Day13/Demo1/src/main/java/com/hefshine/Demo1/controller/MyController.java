package com.hefshine.Demo1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.Demo1.entity.Person;

@RestController
public class MyController {
	
	@RequestMapping(value = "getAllRecord",method = RequestMethod.GET)
	public String getData() {
		System.out.println("Get All Record API Is called...");
		return "All Record";
	}
	
	@RequestMapping(value = "postData",method = RequestMethod.POST)
	public String postData(@RequestBody Person p) {
		System.out.println("Post API is called....");
		System.out.println(p);
		return "Record Addedd Successfully...";
	}
	
	@RequestMapping(value = "updateData/{id}",method = RequestMethod.PUT)
	public String updateData(@RequestBody Person p,@PathVariable Integer id) {
		System.out.println("Update API is called....");
		System.out.println(p);
		System.out.println("Id is "+id);
		return "Update Data Successfully";
	}
	@RequestMapping(value = "deleteData/{id}",method = RequestMethod.DELETE)
	public String deleteData(@PathVariable Integer id) {
		System.out.println("Delete API is called....");
		System.out.println("Id is "+id);
		return "Delete Data Successfully";
		
	}
	
	
	
	
	

}
