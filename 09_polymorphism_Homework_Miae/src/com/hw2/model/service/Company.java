package com.hw2.model.service;

import java.util.Arrays;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	private Employee[] employee; 	// 전체 직원 저장용 배열
	private int employeeCount;		// 직원수
	
	public Company(int size) {
		super();
		this.employeeCount = 0;
		
		employee = new Employee[size];
	}

	@Override
	public void addPerson(Person person) {
//		추상메서드를 상속받아 오버라이딩 해야하는 메서드.
//		매개변수로 전달받은 Person 객체가 Employee 클래스의	인스턴스이며,
//		배열에 공간이 있다면, 해당객체를 employees 배열에 추가 후 추가된 객체의 정보를 출력.
//		만약 배열에 더 이상 공간이 없다면, 인원이 모두 충원되었다는 메시지 출력
		
		if(employee[employeeCount] == null) {
			employee[employeeCount] = new Employee(person.getId(), person.getName(),
					((Employee)person).getPosition() );
			System.out.println("직원이 추가되었습니다 - " + employee[employeeCount].getInfo());
			employeeCount++;
			
		} else if(employeeCount == employee.length){
			System.out.println("인원이 모두 충원되었습니다.");
		}
		
	}

	@Override
	public void removePerson(String id) {
//		추상메서드를 상속받아 오버라이딩 해야하는 메서드.
//		매개변수로 전달받은 id와 일치하는 직원을 찾으면,
//		해당 직원을 삭제하고 관련 정보를 출력.
//		일치하는 id가 없다면 해당 id를 가진 직원을 찾을 수 없다는 메시지를 출력.
		
		for(int i = 0; i <= employeeCount; i++) {
			if(employee[i] != null) {
				if((employee[i].getId()).equals(id)) {
					System.out.println("직원이 삭제되었습니다 - " + employee[i].getInfo());
					employee[i] = null;
					break;
				}else {
					System.out.println("해당 ID를 가진 직원을 찾을 수 없습니다.");
				}
			} 
		}
		
		
	}

	@Override
	public void displayAllPerson() {
		System.out.println("전체 직원 명단 : ");
		for(int i = 0; i < employee.length; i++) {
			if(employee[i] == null) {
				continue;
			}
			System.out.println(employee[i].getInfo());
		}
		
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	
	
	
}
