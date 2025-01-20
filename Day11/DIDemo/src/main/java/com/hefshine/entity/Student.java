package com.hefshine.entity;

public class Student {
	
	private Integer id;
	private String name;
	
	Address address;
	
	public Student() {}
	
	
	
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}



	public Student(String name) {
		super();
		this.name = name;
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
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
	
	

}
