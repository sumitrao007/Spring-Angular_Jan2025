package com.sumit.WorkFlow.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.WorkFlow.dao.MainDao;
import com.sumit.WorkFlow.entity.Country;

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

}
