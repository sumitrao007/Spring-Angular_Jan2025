package com.sumit.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.sumit.entity.Laptop1;

import com.sumit.entity.Student1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student1.class);
		config.addAnnotatedClass(Laptop1.class);
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();		
		session.beginTransaction();		
		Laptop1 lap1=new Laptop1("Dell");
		Laptop1 lap2=new Laptop1("HP");
		Laptop1 lap3=new Laptop1("Mac");
//		session.persist(lap1);
//		session.persist(lap2);
//		session.persist(lap3);
		
//		Student1 stud=new Student1("Abc");
//		
//		Laptop1 Lapi_Student= session.get(Laptop1.class, 5);
//		
//		stud.setLaptop1(Lapi_Student);
//		
//		session.persist(stud);
	
		
		session.getTransaction().commit();
		session.close();
		
		

	}

}
