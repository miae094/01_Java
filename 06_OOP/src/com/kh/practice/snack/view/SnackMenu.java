package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	Scanner sc = new Scanner(System.in);
	SnackController src = new SnackController();
	
	// 사용자가 Snack 객체에 데이터를 저장할 수 있도록 값을 받고
	// 저장한 값을 출력하는 메서드
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.next();

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();

		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		String result = src.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		System.out.println(src.confirmData());
		
		
		
		
	}

}
