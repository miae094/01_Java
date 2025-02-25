package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 아래의
//		사용데이터를 참고하여 3명의 학생 객체 생성 후 반복문을 통해 출력
		Student[] std = new Student[3];
		
		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");
		
//		for(int i = 0; i < std.length; i++) {
//			System.out.println(std[i].infomation());
//		}
		
		/*
		 * 향상된 for 문
		 * 자바에서 배열, 컬렉션과 같은 데이터를
		 * 순차적으로 간단하게 반복할 수 있는 구조를 제공
		 * 일반적인 for 문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복작업을 더 쉽게 작성할 수 있다.
		 * 
		 * for (데이터타입 변수명 : 배열 또는 컬렉션){
		 * 		// 반복해서 실행해야 하는 코드
		 * }
		 * 
		 */
		
		for(Student s : std) {	// 0번 인덱스부터 마지막 인덱스까지 순차접근
			System.out.println(s.infomation());
		}
		
		System.out.println("=========================================");
		
		
//		2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고 반복문을
//		사용하여 키보드로 사원 정보를 입력 받도록 구현
//		2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고
//		현재까지 기록된 사원들의 정보 출력
		
		Employee[] emp = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emp[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			// 배열이 꽉 찼으면 반복 종료
			if(emp.length == count) {
				break;
			}
			
			System.out.print("계속 입력 ㄱ?(y/n) : ");
			String str = sc.next().toUpperCase(); // 소문자 -> 대문자
			// String.toUpperCase() : "n" -> "N"
			// String.toLowerCase() : 대문자 -> 소문자 "N" -> "n"

			if(str.equals("N")) break;
			
			////////////// 또는 ////////////////
			/*
			String str2 = sc.next(); // 소문자 -> 대문자
			// String.toUpperCase() : "n" -> "N"
			// String.toLowerCase() : 대문자 -> 소문자 "N" -> "n"
			if(str.equalsIgnoreCase("N")) break;
			 equalsIgnoreCase() : 문자열 비교 메서드
			 -> 대소문자를 구분하지 않고 두 문자열이 같은지 비교
			*/
			
			
//			char result = sc.next().charAt(0);
//			
//			if(result == 'n' || result == 'N') {
//				break;
//			}else if(result == 'y' || result == 'Y') {
//				count++;
//			} 
			
		}
		
		// 현재까지 기록된 사원들의 정보를 모두 출력(향상된 for 문 사용)
		for(Employee e : emp) {
			// [첫번째객체에대한주소, 두번째객체에대한주소, null, null...]
			// 만약에 e 가 null 이면 반복종료해라
			
			if(e==null) break;
			System.out.println(e.infomation());
			
			
		}
		
		
		
//		for(int i = 0; i < emp.length; i++) {
//			if(emp[i] != null) {
//				System.out.println(emp[i].infomation());
//			} else {
//				break;
//			}
//			
//		}
	}

}
