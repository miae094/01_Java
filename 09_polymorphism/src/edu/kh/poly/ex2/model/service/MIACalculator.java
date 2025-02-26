package edu.kh.poly.ex2.model.service;

public class MIACalculator implements Calculator, TestInterface {
	// extends : 확장하다, implements : 구현하다
	// (부)클래스 - (자)클래스 : extends
	// (부)인터페이스 - (자)인터페이스 : extends 
	// (부)인터페이스 - (자)클래스 : implements
	// (부)클래스 - (자)인터페이스 : 상속 불가
	
	// The type MIACalculator must implement the inherited abstract method Calculator.minus(int, int)

	// 인터페이스 다중상속시 동일한 명의 메서드가 있는 경우 하나만 오버라이딩 해줘도 됨
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int devide(int num1, int num2) {
		return num1 / num2;
	}

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return null;
	}

	
	// 다중상속중인 인터페이스들에 같은 디폴트 메서드가 겹치면
	// 오류 발생
	// -> 구현 클래스에서 오버라이딩 반드시 해야함
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Calculator.super.display();
	}
}
