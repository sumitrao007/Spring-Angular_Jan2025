package com.hefshine.entity;

public class Address {
	
	private Integer id;
	private String city;
	
	public Address() {}
	
	public Address(String city) {
		super();
		this.city = city;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + "]";
	}
	
	
	

}
