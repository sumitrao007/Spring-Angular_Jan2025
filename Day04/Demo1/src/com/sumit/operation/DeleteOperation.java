package com.sumit.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sumit.entity.Song;

public class DeleteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();	
		Song song= session.get(Song.class, 2);
		session.remove(song);
		session.getTransaction().commit();
		session.close();
		

	}

}
