package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {

	private Prisoner[] prisoner;
	private int prisonerCount;
	
	
	
	public Prison(int size) {
		super();
		this.prisonerCount = 0;
		prisoner = new Prisoner[size];
	}

	@Override
	public void addPerson(Person person) {
		
//		추상메서드를 상속받아 오버라이딩 해야하는 메서드.
//		매개변수로 전달받은 Person 객체가 Prisoner 클래스의 인스턴스이며,
//		배열에 공간이 있다면, 해당 객체를 prisoners 배열에 추가 후 추가된 객체의 정보를 출력.
//		만약 배열에 더 이상 공간이 없다면, 인원이 모두 충원되었다는 메시지 출력
		
		if(prisoner[prisonerCount] == null) {
			prisoner[prisonerCount] = new Prisoner(person.getId(), person.getName(),
					((Prisoner)person).getCrime());
			System.out.println("수감자가 추가되었습니다 - " + prisoner[prisonerCount].getInfo());
			prisonerCount++;
			
		} else if(prisonerCount == prisoner.length){
			System.out.println("인원이 모두 충원되었습니다.");
		}		
		
		
		
	}

	@Override
	public void removePerson(String id) {
//		추상메서드를 상속받아 오버라이딩 해야하는 메서드.
//		매개변수로 전달받은 id와 일치하는 수감자를 찾으면,
//		해당 수감자를 삭제하고 관련 정보를 출력.
//		일치하는 id가 없다면 해당 id를 가진 수감자를 찾을 수 없다는 메시지를 출력.
		
		for(int i = 0; i <= prisonerCount; i++) {
			if(prisoner[i] != null) {
				if((prisoner[i].getId()).equals(id)) {
					System.out.println("수감자가 삭제되었습니다 - " + prisoner[i].getInfo());
					prisoner[i] = null;
					break;
				}else {
					System.out.println("해당 ID를 가진 수감자를 찾을 수 없습니다.");
				}
			} 
		}
		
	}

	@Override
	public void displayAllPerson() {
		System.out.println("전체 수감자 명단 : ");
		for(int i = 0; i < prisoner.length; i++) {
			if(prisoner[i] == null) {
				continue;
			}
			System.out.println(prisoner[i].getInfo());
		}
		
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}

	
}
