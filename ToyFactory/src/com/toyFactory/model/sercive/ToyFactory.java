package com.toyFactory.model.sercive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {
	
	
	Scanner sc = new Scanner(System.in);
	//set
	Set<Toy> toySet = new HashSet<>();
	Toy toy = new Toy();
	
	//map
	Map<Integer, String> materialMap = new HashMap<>();
	
	
	public ToyFactory() {
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19550805", materialMap.get(1), materialMap.get(4)));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", materialMap.get(1), materialMap.get(2)));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", materialMap.get(1), materialMap.get(2)));
		toySet.add(new Toy("캣냅", 8, 27000, "보라색", "19660128", materialMap.get(1), materialMap.get(2)));
		toySet.add(new Toy("파피", 12, 57000, "빨간색", "19931225", materialMap.get(1), materialMap.get(2), materialMap.get(4)));
		
		
		
	}
	
	
	public void display() {
		int input = 0;
		
		do {
			System.out.println("<< 플레이타임 공장 >>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			
			
			System.out.print("선택 : ");
			input = sc.nextInt();
			
			
			switch (input) {
				case 1: selectToy(); break;
				case 2: System.out.println(newToy()); ; break;
				case 3: System.out.println(deleteToy()); break;
				case 4: selectMadeDate(); break;
				case 5: break;
				case 6: break;
				case 7: break;
				case 0: System.out.println("종료"); break;
				
				default : System.out.println("1~7까지의 숫자를 입력해주세요.");
			}
			
		} while (input != 0);
		
		
		
		
		
	}

	public void selectToy() {
		System.out.println("<전체 장난감 목록>");
		
		for(Toy t : toySet) {
			System.out.println(t);
		}
		
		
	}
	
	public String newToy() {
		
		try {
			System.out.println("<새로운 장난감 추가>");
			System.out.print("장난감 이름 : ");
			String name = sc.next();
			
			System.out.print("사용 가능 연령 : ");
			int use_age = sc.nextInt();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			System.out.print("색상 : ");
			String color = sc.next();
			
			System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
			String made_date = sc.next();
			String input="";
			
			Set<String >newSet = new HashSet<>();
			
			while(!input.equals("q")) {
				System.out.print("재료를 입력하세요 : ");
				input = sc.next();
				
				if(input.equals("q")) {
					break;
				}
				
				boolean flag =  materialMap.containsValue(input);
				if(flag) {
					newSet.add(input);
				}
				
			}
			
			toySet.add(new Toy(name, use_age, price, color, made_date, newSet));
			
			return "새로운 장난감이 추가되었습니다.";
		} catch (Exception e) {
			return "값 입력 다시 ㄱㄱ";
		}
		
	}
	
	
	public String deleteToy(){
		
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(Toy t : toySet) {
			if(t.getName().equals(name)) {
				toySet.remove(t);
				return "장난감이 삭제되었습니다.";
			}
		}
		
		
		return "장난감이 없는데요...";
	}
	
	public void selectMadeDate() {
		
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		
	}
}
