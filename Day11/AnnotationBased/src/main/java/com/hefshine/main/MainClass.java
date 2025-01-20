package com.hefshine.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hefshine.entity.Address;
import com.hefshine.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println("Application Started...");
		
		Student s= context.getBean(Student.class);
		//Student s1= context.getBean(Student.class);
		System.out.println(s);
		//System.out.println(s1);
		
		Address addr= context.getBean(Address.class);
		System.out.println(addr);
		
		
		

	}

}
