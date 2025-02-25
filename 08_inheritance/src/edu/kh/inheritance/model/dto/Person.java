package edu.kh.inheritance.model.dto;

// DTO(Data Transfer Object) : 비즈니스 계층(DB)과 데이터 교환을 위해 사용하는 객체.
// -> DB에서 데이터를 받아오는 클래스! ㅇㅋㅇㅋ 이해완 
public class Person /*extends Object*/ {		
	// Object 클래스 : 기본적으로 모든 클래스에 상속되고있는중
	// - 모든 클래스의 최상위 부모
	// - class 선언부에 상속 구문이 하나도 작성되어 있지 않다면
	//   컴파일러가 extends Object 라는 구문을 자동으로 추가해준다.
	
	// 속성(필드)
	private String name;
	private int age;
	private String nationality;

	// 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	// 생성자의 역할 : 객체 생성 기능
	// 자식 객체를 생성하면 자식객체 내부에 부모객체가 먼저 생성된다.
	// -> 부모생성자가 먼저 호출되면서 부모객체 먼저 생성
	// -> 자식생성자 호출되면서 자식 객체 생성, 
	// 		이때 자식 객체안쪽에 부모객체 포함
	public Person(String name, int age, String nationality) {
		super();	// super생성자. 부모의 생성자를 의미(Object 클래스의 기본생성자)
					// 컴파일러가 자동으로 추가해줌 
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	
	// 기능(메서드)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰당!");
	}
	
	public void move() {
		System.out.println("사람은 움질일 수 있다.");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +" / " + age +" / " +  nationality;
	}
	
	
}
