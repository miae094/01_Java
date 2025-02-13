package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice1() {
		/*
		 * 마트에서 고객에게 할인 혜택을 제공하려고 한다
			물건의 총 가격과 회원 여부를 입력받아, 
			회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
			
			메서드 : public void practice1() {}
			
			[실행화면]
			가격을 입력 하세요 : 10000
			멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
			할인을 포함한 최종금액 : 9000.0원
			
			
			가격을 입력 하세요 : 10000
			멤버십 있으세요? (있으면 true / 없으면 false 입력) : false
			할인을 포함한 최종금액 : 9500.0원
					 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력)");
		boolean membership = sc.nextBoolean();
		System.out.println("membership : " + membership);
				
		double dc_price = (membership == true ? price * 0.90 : price  *0.95);
		
		
		System.out.println("dc_price : " + dc_price);
				
		System.out.printf("할인을 포함한 최종 금액 : %.1f", dc_price);
		
//		double discount = membership ? price * 0.10 : price *0.05;
//		double finalPrice = price - discount;

	}
	
	public void practice2() {
		/*
		 * 
		 * ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
			ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
			
			메서드 : public void practice2() {}
			
			[실행화면]
			출금할 금액 입력 : 123000
			50000원: 2
			10000원: 2
			5000원: 0
			1000원: 3
			
			
			출금할 금액 입력 : 253000
			50000원: 5
			10000원: 0
			5000원: 0
			1000원: 3
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출금할 금액 입력 : ");
		int amount = sc.nextInt();
		
		int fiftyTh = amount / 50000; // 5만원짜리 지폐 갯수
		//amount = amount % 50000; // 5만원짜리 지폐 거르고 난 뒤 나머지 금액
		// 나머지 값을 amount 변수에 재대입해야 아래 다음 지폐에서 재사용 할 수 있음.
		amount %= 50000; // 복합 대입 연산자 (%와 = 을 합쳐서 사용해도 동일함)
		
		int tenTh = amount / 10000; //1만원짜리 지폐 갯수
		amount %= 10000;
		
		int fiveTh = amount / 5000; // 5천원짜리 지폐 갯수
		amount %= 5000;
		
		int oneTh = amount / 1000; // 1천원짜리 지폐 갯수
		amount %= 1000;
		
		System.out.printf("50000원: %d\n10000원: %d\n5000원 : %d\n1000원: %d\n", fiftyTh, tenTh, fiveTh, oneTh );
		
		//System.out.printf("50000원: %d\n 10000원: %d\n 5000원 : %d\n 1000원: %d\n", money/50000, money%50000/10000, money%50000%10000/5000, money%50000%10000%5000/1000  );
		

		
		
		
		
		
	}

	public void practice3() {
		/*
		 * 사용자로부터 두 개의 정수를 입력받아, 
			첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
			만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
			
			메서드 : public void practice3() {}
			
			[실행화면]
			첫 번째 수 : 100
			두 번째 수 : 5
			배수입니다
			
			첫 번째 수 : 200
			두 번째 수 : 7
			배수가 아닙니다
		 * 
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두번째 수 : ");
		int input2 = sc.nextInt();
		
		String result = input1 % input2 == 0 ? "배수입니다" : "배수가 아닙니다";
		
		System.out.println(result);
		
	}
}
