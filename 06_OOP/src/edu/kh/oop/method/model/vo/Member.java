package edu.kh.oop.method.model.vo;

public class Member {	// 회원 클래스
	// 속성 + 기능
	
	// 필드(== 속성)
	private String memberId;	// 아이디
	private String memgerPw; 	// 비밀번호
	private String memberName; 	// 이름
	private int memberAge;		// 나이
	
	// 생성자(== 기능)
	// 생성자 규칙 : 반환형이 없고 클래스명과 이름이 같아야함
	
	public Member() {}
	// 기본생성자 없으면 컴파일러가 자동으로 생성해주지만,
	// 매개변수 생성자가 하나라도 있다면 기본생성자 자동 생성 안해줌.
	
	// 매개변수 생성자(모든 필드 초기화용)
	public Member(String memberId, String memgerPw, String memberName, int memberAge) {
		// 오버로딩 적용중
		// 1. 이름이 같아야 한다.
		// 2. 매개변수의 개수, 타입, 순서 중 하나라도 달라야함
		
		this.memberId = memberId;
		this.memgerPw = memgerPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}
	
	// 메서드(== 기능)
	
	
	
	
	////////////// getter, setter(메서드영역) //////////////////////
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemgerPw() {
		return memgerPw;
	}
	public void setMemgerPw(String memgerPw) {
		this.memgerPw = memgerPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
}
