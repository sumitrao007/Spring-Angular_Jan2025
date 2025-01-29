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

	public String updateEmployee(Employee emp) {
		
		Session session=null;
		Transaction tx=null;
		String msg=null;
		Employee databaseRecord=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();	
			
			databaseRecord= session.get(Employee.class, emp.getId());
			
			if(emp.getName()!=null) {
				databaseRecord.setName(emp.getName());
			}
			if(emp.getStatus()!=null) {
				databaseRecord.setStatus(emp.getStatus());
			}
			if(emp.getDepartment()!=null) {
				databaseRecord.setDepartment(emp.getDepartment());
			}
			if(emp.getMobileno()!=null) {
				databaseRecord.setMobileno(emp.getMobileno());
			}
			if(emp.getEmailid()!=null) {
				databaseRecord.setEmailid(emp.getEmailid());
			}
			if(emp.getCreatedBy()!=null) {
				databaseRecord.setCreatedBy(emp.getCreatedBy());
			}
			if(emp.getCreatedDate()!=null) {
				databaseRecord.setCreatedDate(emp.getCreatedDate());
			}
			if(emp.getUpdatedBy()!=null) {
				databaseRecord.setUpdatedBy(emp.getUpdatedBy());
			}
			if(emp.getUpdatedDate()!=null) {
				databaseRecord.setUpdatedDate(emp.getUpdatedDate());
			}
			if(emp.getSalary()!=0) {
				databaseRecord.setSalary(emp.getSalary());
			}
			if(emp.getCountry()!=null) {
				databaseRecord.setCountry(emp.getCountry());
			}
			
			session.merge(databaseRecord);
			tx.commit();
			msg="Employee is Updatated Successfully";
			
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

	public String deleteEmployee(Integer id) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		Employee databaseRecord=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();	
			databaseRecord=session.get(Employee.class, id);
			session.remove(databaseRecord);
			tx.commit();
			msg="Employee Record is Deleted...";
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

	public Employee getParticularEmployeeById(Integer id) {
		Session session=null;
		Transaction tx=null;
	
		Employee databaseRecord=null;
		
		try {
			session=factory.openSession();
			tx=session.beginTransaction();	
			databaseRecord=session.get(Employee.class, id);
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
		
		return databaseRecord;
	}

	public List<Employee> getAllEmployee() {
		Session session=null;
		Transaction tx=null;
		List<Employee> list=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();	
			String hqlQuery="from Employee";
			Query<Employee> query= session.createQuery(hqlQuery,Employee.class);
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

}
