package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	
	public void practice() {

		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		Book bk = new Book();
		System.out.println(bk.toString());
		
		Book bk2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		System.out.println(bk2.toString());
		
		System.out.println("============================================");

		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
		bk.setTitle("C언어");
		bk.setPrice(30000);
		bk.setDiscoumtRate(0.1);
		bk.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(bk.toString());
		
		System.out.println("============================================");
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		// getter 메소드를 이용하여 할인율을 적용한 책 가격 출력
		
		double dcPrice1 = 0;
		dcPrice1 = bk.getPrice() - (bk.getPrice() * bk.getDiscoumtRate());
		double dcPrice2 = 0;
		dcPrice2 = bk2.getPrice() - (bk2.getPrice() * bk2.getDiscoumtRate());
		
		System.out.println("도서명 = " + bk.getTitle());
		System.out.println("할인된 가격 = " + (int)dcPrice1);
		
		System.out.println("도서명 = " + bk2.getTitle());
		System.out.println("할인된 가격 = " + (int)dcPrice2);
		
		
		
	}
}
