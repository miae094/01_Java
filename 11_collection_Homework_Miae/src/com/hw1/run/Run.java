package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		// Friend 객체만 넣을 수 있는 ArrayList 객체를 생성 후
		// 짱구, 철수, 유리, 훈이, 맹구 객체를 생성하여 ArrayList에 추가하기
//		List<Friend> frd = new ArrayList<Friend>();
//			frd.add(new Friend("짱구"));
//			frd.add(new Friend("철수"));
//			frd.add(new Friend("유리"));
//			frd.add(new Friend("훈이"));
//			frd.add(new Friend("맹구"));
		
		// List 에서 다섯객체 중 랜덤으로 하나를 뽑아
		// 골목대장이 누군지 출력하기
		
		Friend fd2 = new Friend();
		fd2.pickLeader();

	}

}
