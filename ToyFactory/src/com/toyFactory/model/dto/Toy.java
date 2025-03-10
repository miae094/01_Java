package com.toyFactory.model.dto;

import java.util.HashSet;
import java.util.Set;


public class Toy {
	
	private String name;
	private int use_age;
	private int price;
	private String color;
	private String made_date;
	
	private Set<String> materialSet;
	
	public Toy() {
		materialSet = new HashSet<>();
		
		
	}
	

	public Toy(String name, int use_age, int price, String color, String made_date, String ...strings) {
		super();
		this.name = name;
		this.use_age = use_age;
		this.price = price;
		this.color = color;
		this.made_date = made_date;
		materialSet = new HashSet<>();
		for(String str : strings) {
			this.materialSet.add(str);
		}
	}


	public Toy(String name, int use_age, int price, String color, String made_date, Set<String> materialSet) {
		super();
		this.name = name;
		this.use_age = use_age;
		this.price = price;
		this.color = color;
		this.made_date = made_date;
		this.materialSet = materialSet;
	}


	@Override
	public String toString() {
		String str =  "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용 가능 연령 : " + use_age + " / 제조년월일 : "
				+ made_date + " / 재료 : ";
		int index = 0;
		
			for(String s : materialSet ) {
				if(index == materialSet.size()-1) {
					str += s;
					
				} else {
					str += s +", ";
				}
				index++;
			}
		
		
		return str;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUse_age() {
		return use_age;
	}

	public void setUse_age(int use_age) {
		this.use_age = use_age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMade_date() {
		return made_date;
	}

	public void setMade_date(String made_date) {
		this.made_date = made_date;
	}

	
	
	
}
