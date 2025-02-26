package edu.kh.poly.ex1.model.dto;

public class Car {
	
	// 속성
	private String engine;	// 엔진
	private String fuel;	// 연료
	private int wheel;		// 바퀴갯수
	
	
	
	// 기능
	public Car() {
		// TODO Auto-generated constructor stub
	}


	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}


	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	
	// Object.toString() 오버라이딩
	// 오버라이딩?
	// -> 부모클래스엥서 정의된 메서드를 자식클래스에서 재정의하는것.
	
	@Override
	public String toString() {
		// 참조변수 : 어떤 객체의 주소값을 가지고 있음
		return engine + " / " + fuel + " / " + wheel;
	}
	
	
	
}
