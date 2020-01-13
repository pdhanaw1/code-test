package com.altimetrik.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Countries implements Serializable{

	private PageInfo page;
	private ArrayList<CountryInfor> contryInfo;
	
	public PageInfo getPage() {
		return page;
	}
	public void setPage(PageInfo page) {
		this.page = page;
	}
	public ArrayList<CountryInfor> getContryInfo() {
		return contryInfo;
	}
	public void setContryInfo(ArrayList<CountryInfor> contryInfo) {
		this.contryInfo = contryInfo;
	}

	
	
	
}
