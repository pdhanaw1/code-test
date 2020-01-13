package com.altimetrik.model;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Response implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Countries> countries;
	
	public ArrayList<Countries> getCountries() {
		return countries;
	}
	
	public void setCountries(ArrayList<Countries> countries) {
		this.countries = countries;
	}



}
