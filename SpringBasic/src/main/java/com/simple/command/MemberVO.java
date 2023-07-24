package com.simple.command;

import java.util.ArrayList;

public class MemberVO {
	//1
	private String id;
	private String addr;
	//M
	private ArrayList<ScoreVO> list;
	
	
	public MemberVO() {
	}


	public MemberVO(String id, String addr, ArrayList<ScoreVO> list) {
		super();
		this.id = id;
		this.addr = addr;
		this.list = list;
	}

	

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", addr=" + addr + ", list=" + list + "]";
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


	public synchronized ArrayList<ScoreVO> getList() {
		return list;
	}


	public synchronized void setList(ArrayList<ScoreVO> list) {
		this.list = list;
	}
	
	
	
	
	
}
