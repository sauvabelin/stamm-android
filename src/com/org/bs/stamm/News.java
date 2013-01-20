package com.org.bs.stamm;

import java.util.GregorianCalendar;
import java.util.Vector;

import android.text.format.DateFormat;

public class News {
	
	private String title;
	private String text;
	private String author;
	private GregorianCalendar date;
	private Vector<String> fonctions;
	private Vector<String> branches;
	
	News(String title, String text, String author, GregorianCalendar date, Vector<String> fonctions, Vector<String> branches) {
		this.title = title;
		this.text = text;
		this.author = author;
		this.date = date;
		this.fonctions = fonctions;
		this.branches = branches;
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
	
	public GregorianCalendar getDate()  {
		return date;
	}
	
	public String getDateString() {
		return (String) DateFormat.format("E d MMMM yyyy", date);
	}
	
	public Vector<String> getFonctions() {
		return fonctions;
	}
	
	public Vector<String> getBranches() {
		return branches;
	}
}
