package com.hw2.model.dto;

public class Prisoner extends Person {
	private String crime;	//죄목

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}

	@Override
	public String getInfo() {
		return String.format("id : %s, 이름 : %s, 죄목 : %s", super.id, super.name, crime);
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}
	
	
}
