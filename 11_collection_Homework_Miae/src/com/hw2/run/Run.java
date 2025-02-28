package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		// Zoo 객체 생성
		Zoo zoo = new Zoo();
		// Tiger 객체 생성하여 Zoo 에 추가하기
		Tiger t = new Tiger("호랑이");
		zoo.addAnimal(t);
		// Monkey 객체 생성하여 Zoo 에 추가하기
		Monkey m= new Monkey("원숭이");
		zoo.addAnimal(m);
		
		// 동물원 메뉴 출력하여 입력한 값대로 코드 수행하기
		zoo.displayMenu();
	}

}
