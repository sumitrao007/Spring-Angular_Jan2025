package com.sumit.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sumit.entity.Laptop11;
import com.sumit.entity.Student11;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student11.class);
		config.addAnnotatedClass(Laptop11.class);
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();		
		session.beginTransaction();	
		
		Laptop11 lap1=new Laptop11("Dell");
		Laptop11 lap2=new Laptop11("HP");
		Laptop11 lap3=new Laptop11("Mac");
		
		List<Laptop11> lapList=new ArrayList<Laptop11>();
		
//		lapList.add(lap1);
//		lapList.add(lap2);
//		lapList.add(lap3);
		
//		Laptop11 l1= session.get(Laptop11.class, 2);
//		lapList.add(l1);
		
		
//		Student11 stud=new Student11("Vijay");
//		stud.setLapList(lapList);
		
//		session.persist(lap1);
//		session.persist(lap2);
//		session.persist(lap3);
		
//		session.persist(stud);
		
		Student11 s= session.get(Student11.class, 1);
		List<Laptop11> fetchlapilist= s.getLapList();
		
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(s);
		
		for (Laptop11 laptop11 : fetchlapilist) {
			System.out.println(laptop11);
		}
		

	}

}
