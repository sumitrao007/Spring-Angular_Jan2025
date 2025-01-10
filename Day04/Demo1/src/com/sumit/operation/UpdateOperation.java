package com.sumit.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sumit.entity.Song;

public class UpdateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();		
		Session session= factory.openSession();		
		session.beginTransaction();
		Integer id1=2;
		 Song s1= session.get(Song.class, id1);		 
		 s1.setName("Abc Abc");		 
		 session.merge(s1);
		 session.getTransaction().commit();
		 session.close();
		

	}

}
