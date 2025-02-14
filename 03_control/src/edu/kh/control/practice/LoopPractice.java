package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		/*
		 * 
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다.
			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			
			ex.
			1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
			1 2 3 4 1 이상의 숫자를 입력해주세요.
		 */
		System.out.printf("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
		
			for(int i = 1; i<=num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
	}
	
	
	
	public void practice2(){
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//
//		ex.
//		1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
//		4 3 2 1 1 이상의 숫자를 입력해주세요.
		
		System.out.printf("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i = num; i>=1; i--) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		
	}
	
	public void practice3(){
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
//
//		ex.
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		
		System.out.printf("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		String result = "";
		
		for(int i = 1; i <=num; i++) {
			sum += i;
			
			if(i!=num) {
				result += i + " + ";
			}else {
				result += i;
			}
			
		}
		
		System.out.println(result + " = "+ sum);
		
		
	}
	
	
	public void practice4() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//
//		ex.
//		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
//		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
//		4 5 6 7 8 4 5 6 7 8 1 이상의 숫자를 입력해주세요.
		
		System.out.printf("첫 번째 숫자 : ");
		int num = sc.nextInt();
		
		
		if(num >= 1) {
			System.out.printf("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num2 >= 1) {
				if(num>num2) {
					for(int i = num2; i <=num; i++) {
						System.out.print(i + " ");
					}
				} else {
					for(int i = num; i <=num2; i++) {
						System.out.print(i + " ");
					}
				}
				
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	
	public void practice5() {
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.
//
//		ex.
//		숫자 : 4
//		===== 4단 =====
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36

		System.out.printf("단 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + " =====");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		
		
	}
	
	
	public void practice6(){
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
//
//		숫자 : 4 숫자 : 10
//		===== 4단 ===== 2~9 사이 숫자만 입력해주세요.
//		===== 5단 =====
//		===== 6단 =====
//		===== 7단 =====
//		===== 8단 =====
//		===== 9단 =====
//		(해당 단의 내용들은 길이 상 생략)
		
		System.out.printf("단 : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan <= 9) {
			
			for(int num = dan; num <= 9; num++) {
				System.out.println("===== " + num + "단 =====");
				
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d \n", num, i, num * i);
				}
			}
			
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
		
		
	}
	
	public void practice7() {
		
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <=i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		****
//		***
//		**
//		*
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = i; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		   *
//		  **
//		 ***
//		****
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // 총 별의 갯수
			
			for(int j = 1; j <= (num-i); j++) { // 한줄당 공백 갯수
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i ; k++ ) { // 한줄당 별의 갯수
				
				System.out.print("*");
			}

			System.out.println("");
		}
	}
	
	public void practice10() {
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 3
//		*
//		**
//		***
//		**
//		*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // 총 별의 갯수
			for(int j = 1; j <= i; j++) { // 한 줄당 별의 갯수
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= num-1; i++) { // 총 별의 갯수 -1
			for(int j = i; j <= num-1; j++) { 
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	
	public void practice11() {
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		   *
//		  ***
//		 *****
//		*******
		System.out.print("정수 입력 : ");
		int row = sc.nextInt();
		
		// 왼쪽에 공백 존재
		// 별의 갯수는 2*row-1
				
		
		for(int i = 1; i <= row; i++) {	// 총 줄수
			for(int space = i; space <= row-1; space++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice12() {
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 5
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		
		
		// 총 줄 수를 입력받음
		// 첫번째와 마지막엔 입력받은 수와 별 갯수 동일
		// 공백 : 입력받은 수 - 2 ?
		// 첫칸과 마지막칸에는 무조건 * 찍힘.
		
		
		System.out.print("정수 입력 : ");
		int row = sc.nextInt();
		
		
		for(int i = 1; i <= row; i++) {	//총 입력받은 수 만큼 반복

			if(i==1 || i==row) {
				for(int j = 1; j<=row; j++) {
					System.out.print("*");
				}
			} else {
				
				System.out.print("*");
				for(int space = 1; space <= (row-2); space++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
	}	
	
	public void practice13() {
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		모두 나머지가 0이 나오는 수
//
//		ex.
//		자연수 하나를 입력하세요 : 15
//		2 3 4 6 8 9 10 12 14 15
//		count : 2
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = "";
		int count = 0;
		
	
		for(int i = 1; i<=num; i++) {
			
			if(i%2==0 || i%3==0) {	// 2와 3의 배수
				result += i + " ";
			}
			
			if(i%2==0 && i%3==0) { // 2와 3의 공배수 갯수
				count++;
			}
			
		}
		System.out.println(result);
		System.out.println("count : " + count);
		
	}	
}
