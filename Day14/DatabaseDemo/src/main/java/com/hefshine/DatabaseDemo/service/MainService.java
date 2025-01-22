package com.hefshine.DatabaseDemo.service;

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

	
	
	

}
