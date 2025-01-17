package com.hefshine.entity;

public class Student {
	
	private Integer id;
	private String name;
	
	public Student() {}
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name,Integer id) {
		super();
		this.name = name;
		this.id=id;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId1(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
