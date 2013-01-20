package com.org.bs.stamm;

import java.util.GregorianCalendar;
import java.util.Locale;

import java.text.SimpleDateFormat;

import com.google.android.gms.maps.model.LatLng;

public class Activite {
	
	private String unit;
	private String subUnit;
	
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;

	private String comment;
	
	private LatLng position;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("E d MMMM yyyy", Locale.getDefault());
	private SimpleDateFormat timeFormat = new SimpleDateFormat("'à' HH'h'mm", Locale.getDefault());
	
	Activite(String unit, String subUnit, String comment,
			GregorianCalendar startDate, GregorianCalendar endDate, LatLng position) {
		this.unit = unit;
		this.subUnit = subUnit;
		this.comment = comment;
		this.startDate= startDate; 
		this.endDate = endDate;
		this.position = position;
	}
	
	public String getTitle() {
		return getUnit() + " - " + getSubUnit();
	}
	
	public String getUnit() {
		return unit;
	}
	
	public String getSubUnit() {
		return subUnit;
	}
	
	public String getComment() {
		return comment;
	}
	
	public LatLng getPosition() {
		return position;
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
