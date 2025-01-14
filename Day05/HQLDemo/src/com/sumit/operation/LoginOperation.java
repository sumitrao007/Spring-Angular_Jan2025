package com.sumit.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sumit.entity.Employee;


public class LoginOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();		
		session.beginTransaction();	
		String hqlQuery="from Employee where username=:myusername and pwd=:pwd";
		
		Query<Employee> query= session.createQuery(hqlQuery,Employee.class);
		String Username="sonu";
		String Pwd="abc";
		query.setParameter("myusername", Username);
		query.setParameter("pwd", Pwd);
		
		Employee emp= query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		if(emp!=null) {
			System.out.println("Login Successfully");
		}else {
			System.out.println("Invalid User");
		}
		

	}

}
