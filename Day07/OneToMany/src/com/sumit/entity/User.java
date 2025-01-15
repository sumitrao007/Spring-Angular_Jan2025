package com.sumit.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn
	List<Address> listaddress;
	
	public User() {}

	public User(String name, List<Address> listaddress) {
		super();
		this.name = name;
		this.listaddress = listaddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getListaddress() {
		return listaddress;
	}

	public void setListaddress(List<Address> listaddress) {
		this.listaddress = listaddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", listaddress=" + listaddress + "]";
	}
	
	
	
	

}
