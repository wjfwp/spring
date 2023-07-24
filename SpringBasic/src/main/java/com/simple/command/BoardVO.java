package com.simple.command;

public class BoardVO {

	private String bno;
	private String name;
	private String title;
	private String content;
	private String note;
	
	public BoardVO() {
	}

	public BoardVO(String bno, String name, String title, String content, String note) {
		super();
		this.bno = bno;
		this.name = name;
		this.title = title;
		this.content = content;
		this.note = note;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", name=" + name + ", title=" + title + ", content=" + content + ", note="
				+ note + "]";
	}

	public synchronized String getBno() {
		return bno;
	}

	public synchronized void setBno(String bno) {
		this.bno = bno;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized String getTitle() {
		return title;
	}

	public synchronized void setTitle(String title) {
		this.title = title;
	}

	public synchronized String getContent() {
		return content;
	}

	public synchronized void setContent(String content) {
		this.content = content;
	}

	public synchronized String getNote() {
		return note;
	}

	public synchronized void setNote(String note) {
		this.note = note;
	}
	
	
	
	
	
	
	
}
