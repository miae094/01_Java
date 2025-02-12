package edu.kh.basic;

// git test 집에서 코드 변경해보기
// 한 줄 주석 : 컴파일러가 해석하지 않는 부분

/* 범위 주석
 * 
 * 직장인이 제일 졸린시간 10시 11시 12시 2시 3시
 * 그냥 다졸림
 */

// class : Java 코드가 작성되는 영역
public class JavaTest {

	// 메인 메서드는 외우기
	// main 메서드 : java application(프로그램)을 실행하기 위해서 
	//				 반드시 필요한 구문
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("만두파티 빨리 해야댕");
		System.out.println("12345");
		// ctrl+alt+방향키(위아래) : 방향키 방향으로 해당 줄 복사
		
		
		
		System.out.println("1+2");
		System.out.println(1+2);
		System.out.println(12%2); //나머지
		System.out.println("14*19 = " + 266); //문자열 + 숫자
		System.out.println("14*19 = " + 14*19);
		
		System.out.println("90+70+65 = " + (90+70+65)); // 단순 문자열 이어쓰기
		// 맨 앞에 있는 +가 문자열과 연결하는 기능이기 때문에 다 이어쓰기로 인식
		// 자바는 사칙연산의 우선순의를 그대로 따르기 때문에 우선계산 원할 시 소괄호 필요
		
		// + 기호의 역할
		// 숫자 +숫자 = 덧셈연산 결과
		// 문자열 + 숫자 or 문자열 + 문자열 => 이어쓰기
		System.out.println("a"+"b"); // 문자열+문자열
		
		
		
		
		
		
	}
	// 실행 단축키 : ctrl+F11
}
