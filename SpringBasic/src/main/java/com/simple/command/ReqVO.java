package com.simple.command;

import java.util.ArrayList;

public class ReqVO {

	//만드는 규칙 - VO와 동일하게 만듭니다
	//폼 값의 name과 동일한 변수를 멤버변수로 선언
	private String name;
	private String age;
	private ArrayList<String> inter; //check박스

	//기본생성자 필수
	public ReqVO() {}

	public ReqVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}
	
	
	//필수는 아니지만 값에 대한 확인을 빠르게 하기 위해서 alt+shift+s Generate toString() 클릭
	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}

	//getter, setter
	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized String getAge() {
		return age;
	}

	public synchronized void setAge(String age) {
		this.age = age;
	}

	public synchronized ArrayList<String> getInter() {
		return inter;
	}

	public synchronized void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}

	
	




}
