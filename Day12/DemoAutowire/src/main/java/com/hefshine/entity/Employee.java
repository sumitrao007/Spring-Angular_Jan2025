package com.hefshine.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${myid}")
	private Integer id;
	private String name;
	
	@Autowired
	Country country;
	
	
	public Employee() {}
	
	
//	@Autowired
	public Employee(@Value("Sumit") String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}



	public Employee(String name) {
		super();
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Country getCountry() {
		return country;
	}

//	@Autowired
	public void setCountry(Country country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
	
	
	

}
