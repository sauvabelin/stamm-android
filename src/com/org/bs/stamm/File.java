package com.org.bs.stamm;

public class File {
	
	private String name;
	private String uri;
	private String type;
	
	public File(String name, String uri, String type) {
		this.name = name;
		this.uri = uri;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUri() {
		return uri;
	}	
	
	public String getType() {
		return type;
	}
}
