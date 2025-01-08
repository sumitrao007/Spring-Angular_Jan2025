package com.sumit.operation;

import org.hibernate.cfg.Configuration;
import com.sumit.entity.Song;

public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		

	}

}
