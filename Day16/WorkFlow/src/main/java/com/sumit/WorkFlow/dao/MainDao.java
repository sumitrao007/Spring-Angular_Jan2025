package com.sumit.WorkFlow.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sumit.WorkFlow.entity.Country;

@Repository
public class MainDao {
	
	@Autowired
	SessionFactory factory;

	public String addCountry(Country country) {
		Session session=null;
		Transaction tx=null;
		String msg=null;		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();			
			session.persist(country);
			tx.commit();		
			msg="Country is Added Successfully";		
			
		}catch (Exception e) {			
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		}finally {
			session.close();
		}
		
		return msg;
				
		
	}

}
