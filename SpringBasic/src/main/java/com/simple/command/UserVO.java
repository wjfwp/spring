package com.simple.command;

public class UserVO {
	private String id;
	private String pw;
	
	public UserVO() {}

	public UserVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public synchronized String getId() {
		return id;
	}

	public synchronized void setId(String id) {
		this.id = id;
	}

	public synchronized String getPw() {
		return pw;
	}

	public synchronized void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
}
