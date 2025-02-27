package edu.kh.generics;

public class Run {
	public static void main(String[] args) {
		
		// String 타입으로 Box 객체 생성
		
		Box<String> stringBox = new Box<String>();
		
		// T가 String 으로 대체됨.
		// -> 필드도 String 타입, getter/setter 에서 사용되는 타입도 String
		
		stringBox.setItem("안녕 제네릭");
		System.out.println(stringBox.getItem());
		

		Box<Integer> integerBox = new Box<Integer>(); // new Box<>(); 처럼 생략가능
		// Java7 이상에서는 우변타입 생략 가능
		// 다이아몬드 연산자 : 컴파일러가 좌변을 보고 타입 우변의 타입을 추론
		integerBox.setItem(36);
		System.out.println(integerBox.getItem());
		
		
		// 제네릭은 객체(Reference Type)만 허용
		// -> 제네릭은 기본 자료형(primitive Type)인 int, double, char 같은
		// 타입은 사용할 수 없다
		// -> 대신 Wrapper 클래스를 사용
		
		/*
		 * Wrapper 클래스
		 * 
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean
		 * 
		 */
		
		int num = 10;
		Integer num1 = num; 	// 오토박싱(Auto-boxing)
								// 기본 자료형 -> wrapper 클래스로 자동변환
		
		int num2 = num1;		// 오토 언박싱(Auto-unboxing)
								// wrapper 클래스 -> 기본 자료형 자동변환
		
		int number = Integer.parseInt("100");
		// 문자열 -> 숫자 변환 메서드
		
	}

}
