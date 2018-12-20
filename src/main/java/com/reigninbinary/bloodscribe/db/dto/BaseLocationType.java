package com.reigninbinary.bloodscribe.db.dto;

public class BaseLocationType {

	private int locationTypeId;
	private String locationType;
	private String description;
	
	public int getLocationTypeId() {
		return locationTypeId;
	}
	public void setLocationTypeId(int locationTypeId) {
		this.locationTypeId = locationTypeId;
	}
	
	public String getLocationType() {
		return locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
