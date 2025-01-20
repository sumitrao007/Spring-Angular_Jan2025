package com.hefshine.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.hefshine.entity.Address;
import com.hefshine.entity.Student;

@ComponentScan(basePackages = {"com.hefshine"})
public class MyConfig {
	
//	@Bean
////	@Scope("prototype")
//	public Student getStudent() {
//		return (new Student());
//	}
	
	
//	@Bean
//	public Address getAddress() {
//		return (new Address());
//	}

}
