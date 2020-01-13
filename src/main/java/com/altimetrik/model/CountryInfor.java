package com.altimetrik.model;

import java.io.Serializable;

public class CountryInfor implements Serializable{ 
	private String id;
	private String iso2Code;
	private String name;
	private String capitalCity;
	private String longitude;
	private String latitude;
	private Region region;
	private AdminRegion adminregion;
	private IncomeLevel incomeLevel;
	private LendingType lendingType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIso2Code() {
		return iso2Code;
	}
	public void setIso2Code(String iso2Code) {
		this.iso2Code = iso2Code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public AdminRegion getAdminregion() {
		return adminregion;
	}
	public void setAdminregion(AdminRegion adminregion) {
		this.adminregion = adminregion;
	}
	public IncomeLevel getIncomeLevel() {
		return incomeLevel;
	}
	public void setIncomeLevel(IncomeLevel incomeLevel) {
		this.incomeLevel = incomeLevel;
	}
	public LendingType getLendingType() {
		return lendingType;
	}
	public void setLendingType(LendingType lendingType) {
		this.lendingType = lendingType;
	}
	
	
	
	
}
