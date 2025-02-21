package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample methodEx = new MethodExample();
		
		// methodEx.method1();
		
				/* 바구니라고 생각해봐
				실행되는대로 순서대로 빠져나감  
		  
		// method2() 메서드 호출(호출3, 실행3)		//
		// method1() 메서드 호출(호출2, 실행2)		//
		// main 메서드 실행	(호출1, 실행3)			//
		// 메서드 실행 이력 stack에 쌓이는 중(LIFO)	//
		////////////////////////////////////////////// 
		 */
		
		MemberService service = new MemberService();
		service.displayMenu();
		
		
		
		
		
	}

}
