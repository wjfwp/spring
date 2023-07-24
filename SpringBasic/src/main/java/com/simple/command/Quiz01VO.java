package com.simple.command;

public class Quiz01VO {
	
	private String year;
	private String month;
	private String day;
	
	public Quiz01VO() { }

	public Quiz01VO(String year, String month, String day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	
	@Override
	public String toString() {
		return  year + month + day;
	}

	public synchronized String getYear() {
		return year;
	}

	public synchronized void setYear(String year) {
		this.year = year;
	}

	public synchronized String getMonth() {
		return month;
	}

	public synchronized void setMonth(String month) {
		this.month = month;
	}

	public synchronized String getDay() {
		return day;
	}

	public synchronized void setDay(String day) {
		this.day = day;
	}
	
	
	
	
	
	
}
