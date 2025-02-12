package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// nextInt() 사용한 후 nextLine() 사용시 문제점
		System.out.print("nextInt() 입력 : "); 
		int intNum = sc.nextInt(); // 정수값 입력 -> 정수값과 엔터(\n)가 입력버퍼에 들어감
		// nextInt()는 정수값만을(공백) 수집 -> 입력버퍼에는 \n만 남은상태

		sc.nextLine(); // 입력버퍼에 남은 개행문자 제거용
		
		System.out.print("nextLine() 입력 : ");
		String word = sc.nextLine(); // 공백까지 포함(개행 포함 => 개행을 읽을 수 있음)
		// 입력버퍼에 남아있는 \n 수집하고 끝남
		
		// nextInt() : 숫자만 가져감. 엔터는 입력버퍼에 남아있음.
		// nextLine()이 입력버퍼에 남아있는 개행문자(엔터)를 읽어서
		// 끝나버림.....
		
		
		
	}
}
