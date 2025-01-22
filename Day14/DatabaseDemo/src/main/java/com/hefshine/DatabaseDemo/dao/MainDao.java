package com.hefshine.DatabaseDemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hefshine.DatabaseDemo.entity.Person;

@Repository
public class MainDao {
	
	@Autowired
	SessionFactory factory;

	public String addRecord(Person p) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		session.persist(p);
		session.getTransaction().commit();
		session.close();
		String msg="Record Added Successfully...";
		
		return msg;
	}

	public String updateRecord(Person p, Integer id) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		Person person= session.get(Person.class, id);
		person.setName(p.getName());
		person.setMobileno(p.getMobileno());
		session.merge(person);
		session.getTransaction().commit();
		session.close();
		String msg="Data update Successfully";
		return msg;
	}
	
	

}
