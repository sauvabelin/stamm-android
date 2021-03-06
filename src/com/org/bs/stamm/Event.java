package com.org.bs.stamm;

import java.util.GregorianCalendar;
import java.util.Locale;

import java.text.SimpleDateFormat;

public class Event {
	
	private String title;
	private String text;
	private String author;
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("E d MMMM yyyy", Locale.getDefault());
	private SimpleDateFormat timeFormat = new SimpleDateFormat("'à' HH'h'mm", Locale.getDefault());
	
	
	Event(String title, String text, String author,
			GregorianCalendar startDate, GregorianCalendar endDate) {
		this.title = title;
		this.text = text;
		this.author = author;
		this.startDate= startDate; 
		this.endDate = endDate;
	}

	
	public String getTitle()  {
		return title;
	}
	
	public String getText()  {
		return text;
	}
	
	public String getAbstract() {
		return getText().substring(0, 50) + "...";
	}
	
	public String getAuthor()  {
		return author;
	}
	
	public GregorianCalendar getStartDate()  {
		return startDate;
	}
	
	public String getStartDateString()  {
		dateFormat.setCalendar(startDate); 
		return (String) dateFormat.format(startDate.getTime());
	}
	
	public GregorianCalendar getEndDate()  {
		return endDate;
	}
	
	public String getEndDateString()  {
		
		if(startDate.get(GregorianCalendar.DAY_OF_YEAR) == endDate.get(GregorianCalendar.DAY_OF_YEAR))
			return "le même jour";
		
		dateFormat.setCalendar(endDate); 
		return (String) dateFormat.format(endDate.getTime());
	}
	
	public String getStartTime()  {
		
		if(startDate.get(GregorianCalendar.HOUR_OF_DAY) == 0 &&
				startDate.get(GregorianCalendar.MINUTE) == 0 )
			return null;
		
		timeFormat.setCalendar(startDate); 
		return (String) timeFormat.format(startDate.getTime());
	}
	
	public String getEndTime()  {
		
		if(endDate.get(GregorianCalendar.HOUR_OF_DAY) == 0 &&
				endDate.get(GregorianCalendar.MINUTE) == 0 )
			return null;
		
		timeFormat.setCalendar(endDate); 
		return (String) timeFormat.format(endDate.getTime());
	}
}
