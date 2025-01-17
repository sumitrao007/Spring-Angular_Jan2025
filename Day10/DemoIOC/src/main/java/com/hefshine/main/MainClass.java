package com.hefshine.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.entity.Address;
import com.hefshine.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		
		Student student= context.getBean("s1", Student.class);
		
		//Student student1= context.getBean("s1", Student.class);
		
			System.out.println(student);
			//System.out.println(student1);
		
		 Address addr= context.getBean(Address.class);
		 
		 System.out.println(addr);

	}

}
