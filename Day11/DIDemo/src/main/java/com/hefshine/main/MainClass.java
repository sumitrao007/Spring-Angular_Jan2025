package com.hefshine.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.entity.Address;
import com.hefshine.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		
		Student s= context.getBean("s1", Student.class);
		System.out.println(s);
		
//		Address add= context.getBean("addr" ,Address.class);
//		System.out.println(add);

	}

}
