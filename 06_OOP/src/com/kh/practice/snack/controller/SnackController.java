package com.kh.practice.snack.controller;

import java.util.Scanner;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s = new Snack();
	
	public SnackController() {
		// TODO Auto-generated constructor stub
	}
	
	// 데이터를 setter를 이용해 저장하고
	// 저장완료 되었다는 결과를 반환하는 메서드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다.";
		
	}
	
	// 저장된 데이터를 반환하는 메소드
	public String confirmData() {
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) " );
		Scanner sc = new Scanner(System.in);
		char str = sc.nextLine().charAt(0);
		
		if(str=='y' || str=='Y') {
			
			return s.infomation();
		} else if(str=='n' || str=='N') {
		
			return "끝";
		} else {
			return "y 또는 n 만 입력해주세요";
		}
	
	}
	

}
