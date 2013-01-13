package com.org.bs.stamm;

public class Event {
	
	private String title;
	private String text;
	private String author;
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	
	Event(String title, String text, String author,
			String startDate, String endDate, String startTime, String endTime) {
		this.title = title;
		this.text = text;
		this.author = author;
		this.startDate= startDate; 
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
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
	
	public String getStartDate()  {
		return this.startDate;
	}
	
	public String getEndDate()  {
		return this.endDate;
	}
	
	public String getStartTime()  {
		return this.startTime;
	}
	
	public String getEndTime()  {
		return this.endTime;
	}
}
