package com.simple.command;

public class ScoreVO {

	private int num;
	private String name;
	private String kor;
	private String eng;
	
	private String id;
	private String addr;
	
	public ScoreVO() {
	}

	public ScoreVO(int num, String name, String kor, String eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}


	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", id=" + id + ", addr="
				+ addr + "]";
	}

	public synchronized int getNum() {
		return num;
	}

	public synchronized void setNum(int num) {
		this.num = num;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized String getKor() {
		return kor;
	}

	public synchronized void setKor(String kor) {
		this.kor = kor;
	}

	public synchronized String getEng() {
		return eng;
	}

	public synchronized void setEng(String eng) {
		this.eng = eng;
	}

	public synchronized String getId() {
		return id;
	}

	public synchronized void setId(String id) {
		this.id = id;
	}

	public synchronized String getAddr() {
		return addr;
	}

	public synchronized void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
