package com.hw1.model.vo;

public class Employee extends Person {
	
	private int salary; // 급여
	private String dept; // 부서
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	





	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		
		super(age, height, weight);
		// protected로 선언된 name은 this로 직접 접근이 가능하다!
		this.name = name;	// 부모 클래스인 Person에 작성된 필드 중 protected 접근제한자 name
		this.salary = salary;
		this.dept = dept;
	}


	@Override
	public String infomation() {
		// TODO Auto-generated method stub
		return super.infomation() + String.format(" / 급여 :  %d / 부서 : %s", salary, dept );
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
