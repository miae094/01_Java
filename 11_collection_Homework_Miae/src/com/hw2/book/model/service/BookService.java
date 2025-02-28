package com.hw2.book.model.service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.book.model.dto.Book;

public class BookService {
	private List<Book> bookList = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	
	public BookService() {
		bookList.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		bookList.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		bookList.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		bookList.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		bookList.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}
	

	
	
	public void displayMenu() {
		
		int stateNum = 0;
		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 주회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴를 입력하세요 : ");
			
			try {
				stateNum = sc.nextInt();
				
				switch(stateNum) {
				case 1: System.out.println(insertBook()); break;
				case 2: selectBook(); break;
				case 3: updateBook();break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 7: break;
				case 8: break;
				case 0: System.out.println("프로그램 종료"); break;
				
				
				}
				
			} catch (Exception e) {
				System.out.println("올바른 값을 입력하세요");
			}
			
			
		} while (stateNum != 0);
		
	}
	

	public String insertBook() {
		System.out.println("=====도서 등록=====");
		

		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine(); // 개행문자 제거
	
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine(); // 개행문자 제거
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
			
			
		
		if(bookList.add(new Book(bookNum, title, author, price, publisher))){
			return "등록 완료";
		} else {
			return "등록 실패";
		}
		
		
	}
	
	public void selectBook() {
		if(bookList.isEmpty()) {
			System.out.println("도서 정보가 없습니다");
			return; 	// 호출한 메서드로 돌아감
		}
		
		for(Book b : bookList) {
			System.out.println(b);
			
		}
		
	}
	
	public void updateBook() {
		System.out.println("=====도서 수정=====");
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();	// 개행문자 제거
		
		Book book2 = new Book();		// for문에서 나오는 정보를 담기위해 새로운 book2 객체 생성
		for(Book b : bookList) {
			if(b.getBookNum() == bookNum) {
				book2 = b;
			}
		}
		
		
		System.out.println("1. 도서명");
		System.out.println("2. 도서 저자");
		System.out.println("3. 도서 가격");
		System.out.println("4. 도서 출판사");
		System.out.println("0. 수정 종료");
		
		System.out.print("수정할 메뉴 선택 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();	// 개행문자 제거
		
		switch(menuNum) {
		case 1 : {
			System.out.print("수정할 도서 제목을 입력하세요 : ");
			String title = sc.nextLine();
			book2.setTitle(title);
			System.out.println("수정 완료");
			break;
		}
		
		case 2 : {
			System.out.print("수정할 도서 저자를 입력하세요 : ");
			String author = sc.nextLine();
			book2.setAuthor(author);
			System.out.println("수정 완료");
			break;
		}
		
		case 3 : {
			System.out.print("수정할 도서 가격을 입력하세요 : ");
			int price = sc.nextInt();
			book2.setPrice(price);
			System.out.println("수정 완료");
			break;
		}
		case 4 : {
			System.out.print("수정할 도서 출판사를 입력하세요 : ");
			String publisher = sc.nextLine();
			book2.setPublisher(publisher);
			System.out.println("수정 완료");
			break;
		}
		case 0: System.out.println("수정이 종료되었습니다"); break;
		
		default : System.out.println("메뉴에 있는 번호만 입력해주세요.");
		
		
		}
		
	}
	
}
