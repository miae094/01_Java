package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지
// (비밀번호 -> 암호화, 파일 -> 유효한 파일 걸러내는 작업...)
public class AbstractionService {

	// 속성 : 따로 필요하지 않아서 만들지 않음
	// 기능
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
		// new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름을 자료형 처럼 사용된다 *
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다
		
		//int[] arr = new int[5];
		
		/*
		// 직접 접근 : 객체.필드명 / 캡슐화를 어긴 코드
		p1.name = "홍길동"; // The field People.name is not visible
		p1.gender = '남';
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120";
		p1.phone = "010-1234-5678";
		p1.age = 20;
		
		p1.tax();
		p1.vote();
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		//System.out.println("p1의 gender : " + (int)p1.gender); // int로 강제 형변환 하면 숫자로나옴
		// char타입 jvm 기본값은 0
		// 유니코드 문자체계에서 0은 공백을 나타냄
		// -> int 형으로 강제 형변환 하면 0인것을 확인할 수 있음!
		
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		// 전달하는 값(인자) : 전달인자
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setAge(20);
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-1234-5678");
		p1.setpNo("123456-1234567");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getpNo());
		
		System.out.println("========================================");
		
		// 본인 객체
		// People 클래스 이용하여 본인 이름 객체 생성하기
		// 본인의 정보 setter 값 대입
		// getter 이용해서 콘솔창 출력까지
		
		People miae = new People();
		
		miae.setAddress("서울시 동대문구 망우로12다길 14");
		miae.setAge(36);
		miae.setGender('여');
		miae.setName("장미애");
		miae.setPhone("010-5220-9301");
		miae.setpNo("900904-2234567");
		
		System.out.println(miae.getName());
		System.out.println(miae.getAge());
		System.out.println(miae.getGender());
		System.out.println(miae.getAddress());
		System.out.println(miae.getPhone());
		System.out.println(miae.getpNo());
		
		
	}
	
		

}
