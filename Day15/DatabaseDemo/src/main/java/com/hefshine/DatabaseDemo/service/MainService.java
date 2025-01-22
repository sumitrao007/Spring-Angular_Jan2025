package com.hefshine.DatabaseDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefshine.DatabaseDemo.dao.MainDao;
import com.hefshine.DatabaseDemo.entity.Person;

@Service
public class MainService {
	
	@Autowired
	MainDao dao;

	public String addRecord(Person p) {
		
		String msg= dao.addRecord(p);
		
		return msg;
	}

	public String updateRecord(Person p, Integer id) {
		String msg=dao.updateRecord(p,id);
		return msg;
	}

	public Person getParticularRecordById(Integer id) {
		Person p= dao.getParticularRecordById(id);
		return p;
	}

	public String deleteData(Integer id) {
		String msg= dao.deleteData(id);
		return msg;
	}

	public List<Person> getAllRecord() {
		List<Person> list= dao.getAllRecord();
		return list;
		
		
	}

	public Person getRecordByMobileNo(String mobileno) {
		
		Person p= dao.getRecordByMobileNo(mobileno);
		
		return p;
	}

	
	
	

}
