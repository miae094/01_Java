package com.hw2.model.dto;

public class Employee extends Person {


	private String position;	// 직책
	
	

	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}


	@Override
	public String getInfo() {
		return String.format("Id : %s, 이름 : %s, 직책 : %s", super.id, super.name, position);
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
