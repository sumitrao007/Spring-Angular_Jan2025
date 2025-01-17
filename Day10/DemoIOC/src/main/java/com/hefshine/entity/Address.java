package com.hefshine.entity;

public class Address {
	
	private int id;
	private String city;
	private String area;
	
	public Address() {
		
	}
	
	public Address(String city, String area) {
		super();
		this.city = city;
		this.area = area;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", area=" + area + "]";
	}
	
	
	

}
