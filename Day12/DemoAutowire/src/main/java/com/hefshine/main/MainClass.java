package com.hefshine.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hefshine.entity.Country;
import com.hefshine.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
		
		Employee emp= context.getBean(Employee.class);
		System.out.println(emp);
//		
//		Country con= context.getBean(Country.class);
//		System.out.println(con);

	}

}
