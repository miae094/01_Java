package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		/*
		 * 자바의 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte) 
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 * 
		 * 참조형 : 문자열 String
		 */
		
		// 변수의 선언 : 메모리(RAM)에 값을 저장할 공간을 할당
		// 변수 값 대입 : 변수에 값을 집어 넣는 것.
		
		boolean booleanData; // -> 변수의 선언
		// 메모리에 논리값(T/F)을 저장할 공간을 1byte 할당하고
		// 할당된 공간의 이름을 booleanData라고 부르겠다.
		
		booleanData = true; // booleanData 변수에 True 논리값 집어넣기(대입)
		
		System.out.println("booleanData : " + booleanData);
		
		byte byteNumber = 127; // 128 넣는 순간 에러(값의 범위가 -128~127)
		// 메모리에 정수값을 저장할 공간을 1byte할당하고
		// 할당된 공간을 byteNumber라고 부르겠다.
		// 선언된 byteNumber변수에 처음으로(초기값) 127을 넣겠다.
		// --> 초기화
		
		short shourtNumber = 32767;
		
		//정수 자료형 기본형 -> int (short, byte는 옛날 코드의 잔재)
		int intNumber = 2147483647;
		//자료형 변수명 대입연산자 리터럴;
		// 프로그램에서 대입되는 데이터(값 자체)를 리터럴 이라는 단어로도 표현
		// ** 리터럴 : 변수에 대입되거나 작성되어지는 값 자체.
		// 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000l;
		// The literal 10000000000 of type int is out of range
		// 100억 이라는 값은 int의 범위를 벗어났다.
		// 리터럴 값 자체를 int로 인식하고 있다.
		// 뒤에 L을 붙여줌으로써 long 자료형인것을 나타내줌.
		
		float floatNumber=1.2345f;
		
		// Type mismatch: cannot convert from double to float
		// 위와 동일 사유. 실수형의 기본 자료형인 double형으로 인식함
		
		double doubleNumber = 3.141592;
		// 리터럴 표기법 없는 실수는 double로 인식
		// double형도 리터럴 표기법이 있지만 잘 안씀(d 혹은 D);
		
		
		// 문자형(char) 리터럴 표기법 : ''(홑따옴표);
		char ch = 'A';
		char Ch2 = 66; //유니코드
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + Ch2);
		
		/*
		 * chat 자료형에 숫자가 대입될 수 있는 이유
		 * - 컴퓨터에는 문자표가 존재(유니코드 문자체계)
		 *   숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 *   'B'라는 문자 그대로 대입되면 변수에 숫자 66으로 변환되어 저장
		 *   -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는것도 가능
		 *   
		 */
		
		//변수 명명 규칙
		// 1. 대소문자 구분, 길이제한X
		int asdfQwer12345;
		int asdfqwer12345;
		
		// 2. 예약어 사용 불가
		// ex) double final;
		
		// 3. 숫자로 시작 불가
		// 4. 특수문자중에 $, _만 사용가능(하지만 쓰지 않는다)
		// _작성 표기법은 DB혹은 자바의 상수에서 사용.
		// (둘다 대문자만 사용하기 때문에)
		
		// 5. 카멜표기법(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		// 6. 변수명은 언어를 가리지 않는다(하지만 쓰지 않는다.)
		
		
		
		// 상수 : 초기화 이후 다른 데이터 대입 불가.
		final int AGE = 100;
		
		//AGE = 120; 에러 재 대입 불가
		//The final local variable AGE cannot be assigned. It must be blank and not using a compound assignment
		
		/*
		 * 상수(항상 같은 수)
		 * - 변수의 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입 할 수없음
		 * - 자료형 앞에 final 키워드를 작성
		 * - 상수 명명 규칙 : 모두 대문자, 여러 단어 작성시 _ 사용
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때(ex. 계산기의 파이 값)
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 	  -> 게임제작시 오른쪽으로 1 이동 왼쪽으로 -1 이동 등
		 */
		
	}

}
