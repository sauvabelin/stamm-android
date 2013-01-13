package com.org.bs.stamm;

public class News {
	
	private String title;
	private String text;
	private String author;
	private String date;
	
	News(String title, String text, String author, String date) {
		this.title = title;
		this.text = text;
		this.author = author;
		this.date = date;
	}

	
	public String getTitle()  {
		return this.title;
	}
	
	public String getText()  {
		return this.text;
	}
	
	public String getAbstract() {
		return getText().substring(0, 50) + "...";
	}
	
	public String getAuthor()  {
		return this.author;
	}
	
	public String getDate()  {
		return this.date;
	}
}
