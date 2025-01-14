package com.sumit.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sumit.entity.Laptop;
import com.sumit.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Laptop.class);
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();		
		session.beginTransaction();			
//		Laptop lap1=new Laptop("HP");		
//		Student stud=new Student("Sumit", lap1);		
//		session.persist(lap1);
//		session.persist(stud);
		
		Student student= session.get(Student.class, 2);
		student.setName("Honey");		
		session.merge(student);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(student);

	}

}
