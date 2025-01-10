package com.sumit.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

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
		
		String hqlQuery="update Song set name=:myname,singer=:singer where id=:id";
		
		// hibernate 6 
		MutationQuery mQuery= session.createMutationQuery(hqlQuery);		
		mQuery.setParameter("myname", "Apana bana le");
		mQuery.setParameter("id", 1);
		mQuery.setParameter("singer", "ABC");
		int status= mQuery.executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		
		if(status>0) {
			System.out.println("Data is Updatated successfully");
		}else {
			
			System.out.println("Data is not Updatated successfully");
		}
		
		

	}

}
