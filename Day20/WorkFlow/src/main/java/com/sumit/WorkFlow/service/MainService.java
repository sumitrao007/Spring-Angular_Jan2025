package com.sumit.WorkFlow.service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.WorkFlow.dao.MainDao;
import com.sumit.WorkFlow.entity.Country;
import com.sumit.WorkFlow.entity.Employee;

@Service
public class MainService {
	
	@Autowired
	MainDao dao;

	public String addCountry(Country country) {
		String msg= dao.addCountry(country);
		if(Objects.isNull(msg)) {
			msg="Country is Not Addedd..";
		}
		
		return msg;
		
	}

	public String updateCountry(Country country) {
		
		String msg= dao.updateCountry(country);
		
		if(Objects.isNull(msg)) {
			msg="Country is Not Updatated..";
		}
		
		return msg;
	}

	public String deleteCountry(Integer id) {
		String msg= dao.deleteCountry(id);
		
		if(Objects.isNull(msg)) {
			msg="Country is Not Deleted..";
		}
		
		return msg;
	}

	public Country getParticularCountryById(Integer id) {
		Country country=dao.getParticularCountryById(id);
		return country;
	}

	public List<Country> getAllCountry() {
		List<Country> list=dao.getAllCountry();
		return list;
	}

	public String addEmployee(Employee emp) {
		String msg=	dao.addEmployee(emp);
		System.out.println(msg);
		if(Objects.isNull(msg)) {
			msg="Employee is Not Addedd..";
		}
		
		return msg;
	}

	public String updateEmployee(Employee emp) {
		String msg=dao.updateEmployee(emp);
		if(Objects.isNull(msg)) {
			msg="Employee is Not Updatated..";
		}
		
		return msg;
	}

	public String deleteEmployee(Integer id) {
		String msg= dao.deleteEmployee(id);
		if(Objects.isNull(msg)) {
			msg="Employee is Not Deleted..";
		}
		
		return msg;
	}

	public Employee getParticularEmployeeById(Integer id) {
		Employee emp=dao.getParticularEmployeeById(id);
		return emp;
	}

	public List<Employee> getAllEmployee() {
		 List<Employee> list= dao.getAllEmployee();
		return list;
	}

	public HashMap<String, Object> login(Employee emp) {
		Employee e= dao.login(emp);
		HashMap<String, Object> map=new HashMap<String, Object>();
		if(e!=null) {
			map.put("msg", "Valid User");
			map.put("user", e);
		}else {
			map.put("msg", "Invalid User");
			map.put("user", e);
		}
		return map;
	}

	public List<Employee> getEmpBySalaryRange(double startsal, double endsal) {
		List<Employee> listEmp= dao.getEmpBySalaryRange(startsal,endsal);
		
		return listEmp;
	}

	
	
	
	
	
	
	
	
	
	

}
