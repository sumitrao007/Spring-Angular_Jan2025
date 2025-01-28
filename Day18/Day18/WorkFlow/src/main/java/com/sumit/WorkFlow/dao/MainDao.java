package com.sumit.WorkFlow.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sumit.WorkFlow.entity.Country;
import com.sumit.WorkFlow.entity.Employee;

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
			if(session!=null) {
				session.close();
			}
			
		}
		
		return msg;
				
		
	}

	public String updateCountry(Country c) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			
			Country country= session.get(Country.class, c.getCid());			
			if(c.getCname()!=null) {
				country.setCname(c.getCname());
			}
			session.merge(country);
			tx.commit();
			msg="Country is Updatated";
			
		} catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return msg;
	}

	public String deleteCountry(Integer id) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();			
			Country country= session.get(Country.class, id);				
			session.remove(country);
			tx.commit();
			msg="Country is Deleted...";			
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return msg;
	}

	public Country getParticularCountryById(Integer id) {
		Session session=null;
		Transaction tx=null;
		Country country=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();	
			if(id!=null) {
				country=session.get(Country.class, id);
			}
			tx.commit();
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return country;
	}

	public List<Country> getAllCountry() {
		Session session=null;
		Transaction tx=null;
		List<Country> list=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();	
			String hqlQuery="from Country";
			Query<Country> query= session.createQuery(hqlQuery,Country.class);
			list= query.list();
			tx.commit();
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return list;
	}

	public String addEmployee(Employee emp) {
		
		Session session=null;
		Transaction tx=null;
		String msg=null;		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();				
			session.persist(emp);
			tx.commit();
			msg="Employee Added Successfully....";
			
		}catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return msg;
	}

}
