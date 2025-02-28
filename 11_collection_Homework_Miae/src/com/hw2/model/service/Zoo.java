package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Tiger;

public class Zoo {
	private List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {
		
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요:");
		for(Animal ani : animals) {
			ani.sound();
		}
		
		
	}
	
	public void displayMenu() {
		int statusNum = 0;
		do {
			
			System.out.println("****** KH 동물원 ******");
			System.out.println("원하는 작업을 선택하세요 : ");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			
			
			try {
				System.out.print("선택 : ");
				Scanner sc = new Scanner(System.in);
				statusNum = sc.nextInt();
				
				
				switch(statusNum) {
				case 1: showAnimals(); break;
				case 2: System.out.println("프로그램 종료"); break;
				default :System.out.println("메뉴에 없는 번호입니다. 다시 선택해주세요"); 
				}
					
				
			} catch (Exception e) {
				System.out.println("올바른 값을 입력하세요");
			}
		
			
		} while (statusNum != 2);
		
		
		
		
	}
}
