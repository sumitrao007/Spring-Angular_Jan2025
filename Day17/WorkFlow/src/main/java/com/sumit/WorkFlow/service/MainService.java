package com.sumit.WorkFlow.service;

import java.util.List;
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

}
