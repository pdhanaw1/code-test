package com.altimetrik.model;

import java.io.Serializable;

public class AdminRegion implements Serializable{
	private String id;
	private String iso2code;
	private String value;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIso2code() {
		return iso2code;
	}
	public void setIso2code(String iso2code) {
		this.iso2code = iso2code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
