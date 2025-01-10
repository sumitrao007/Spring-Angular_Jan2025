package com.sumit.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.sumit.entity.Song;

public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		Song s1=new Song("Kesariya Kesariya","Arjit Singh");
		session.persist(s1);
		session.getTransaction().commit();
		session.close();
		System.out.println("Data Addedd Successfully...");
		
		
		
		
		
		
		

	}

}
