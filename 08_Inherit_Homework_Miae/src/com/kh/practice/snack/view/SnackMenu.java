package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		SnackController sController = new SnackController();
		System.out.println(sController.saveData(kind, name, flavor, numOf, price));
		
		String result = sc.next();	// y or n
		if(result.equalsIgnoreCase("y")) {
			System.out.println(sController.confirmData());
		}
		
		
	}
}
