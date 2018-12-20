package com.reigninbinary.bloodscribe.db.dto;


public class LocationDescription {

	private int locationId;
	private int descriptionId;
	private String description;
	private String visible;
	
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public int getDescriptionId() {
		return descriptionId;
	}
	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String deescription) {
		this.description = deescription;
	}
	
	public String getVisible() {
		return visible;
	}
	public void setVisible(String visible) {
		this.visible = visible;
	}
}
