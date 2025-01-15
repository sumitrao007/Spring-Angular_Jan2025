package com.sumit.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sumit.entity.Address;
import com.sumit.entity.User;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Address.class);
		config.addAnnotatedClass(User.class);
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();		
		session.beginTransaction();	
		
//		Address addr1=new Address("Pune", "Balaji Nagar");
//		Address addr2=new Address("Pune", "Ambegaon");
//		Address addr3=new Address("Pune", "Narhe");
//		
//		List<Address> listAddr=new ArrayList<Address>();
//		listAddr.add(addr1);
//		listAddr.add(addr2);
//		listAddr.add(addr3);	
//		
//		User user=new User();
//		user.setName("Sumit");
//		user.setListaddress(listAddr);
//		
//		session.persist(addr1);
//		session.persist(addr2);
//		session.persist(addr3);
//		
//		session.persist(user);
		
		User u= session.get(User.class, 1);
		

		session.getTransaction().commit();
		session.close();
		
		System.out.println(u);
		
		
		
		

	}

}
