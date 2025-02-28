package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Friend {
	
	private String name;
	private List<Friend> frd = new ArrayList<Friend>();
	public Friend() {
		frd.add(new Friend("짱구"));
		frd.add(new Friend("철수"));
		frd.add(new Friend("유리"));
		frd.add(new Friend("훈이"));
		frd.add(new Friend("맹구"));
	}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public void pickLeader() {
		// 랜덤으로 한명 뽑기
		
		int num = (int) Math.random() * frd.size() ;
		
		System.out.println("num=========="+num);
		
		frd.get(num);
		
		System.out.println(frd.get(num).getName() + "가 떡잎방범대 대장이다!");
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
