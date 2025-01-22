package com.hefshine.DatabaseDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

	public Person getParticularRecordById(Integer id) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		Person p= session.get(Person.class, id);
		session.getTransaction().commit();
		session.close();
		
		return p;
	}

	public String deleteData(Integer id) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		Person p= session.get(Person.class, id);
		session.remove(p);
		session.getTransaction().commit();
		session.close();
		String msg="Record Deleted Successfully";
		
		return msg;
	}

	public List<Person> getAllRecord() {
		Session session= factory.openSession();
		session.beginTransaction();
		String hqlQuery="from Person";
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		List<Person> list= query.list();
		session.getTransaction().commit();
		session.close();
		return list;
		
	}

	public Person getRecordByMobileNo(String mobileno) {
		
		Session session= factory.openSession();
		session.beginTransaction();
		String hqlQuery="from Person where mobileno=:mobileno";
		Query<Person> query= session.createQuery(hqlQuery,Person.class);
		query.setParameter("mobileno", mobileno);
		Person p= query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		return p;
	}
	
	

}
