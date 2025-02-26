package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		
		// Company 의 생성자를 이용하여 10칸짜리 Employee 객체 배열 생성하는
		// Company 객체를  생성하여 ManagememntSystem 자료형의 company 에 주소를 저장
		
		Company com = new Company(10);	// 10칸짜리 Employee 객체 배열 생성
		ManagementSystem company = com;
		
		
		// Prison 의 생성자를 이용하여 10칸짜리 Prisoner 객체 배열 생성하는
		// Prison 객체를  생성하여 ManagememntSystem 자료형의 prison 에 주소를 저장		
		Prison pri = new Prison(10);
		ManagementSystem prison = pri;
		
		// 2명 정도 직원 새로 등록하기
		Person[] person = new Employee[2];
		person[0] = new Employee("EMP001", "유재석", "기획팀");
		person[1] = new Employee("EMP002", "정형돈", "개발팀");
		
		company.addPerson(person[0]);
		company.addPerson(person[1]);

		// 등록된 전체 직원 조회
		company.displayAllPerson();
		
		
		System.out.println("==============================================================");
		
		
		// 2명 정도 수감자 새로 등록하기
		Person[] person2 = new Prisoner[2];
		person2[0] = new Prisoner("1205", "정준하", "밥도둑");
		person2[1] = new Prisoner("0705", "박명수", "연쇄웃음");
		
		prison.addPerson(person2[0]);
		prison.addPerson(person2[1]);
		
		// 등록된 전체 수감자 조회
		prison.displayAllPerson();
		
		System.out.println("==============================================================");
		
		// EMP001 id 를 가진 직원 삭제
		company.removePerson("EMP001");
		
		// 1205 id 를 가진 수감자 삭제
		prison.removePerson("1205");
		
		System.out.println("==============================================================");

		// 현재 남은 직원 모두 조회
		company.displayAllPerson();
		// 현재 남은 수감자 모두 조회
		prison.displayAllPerson();
		
	}

}
