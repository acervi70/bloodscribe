package com.reigninbinary.bloodscribe.db.dto;


public class LocationTimeline {

	private int locationId;
	private int timelineId;
	private String description;
	private String eventDate;
	private int eventOrder;
	
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public int getTimelineId() {
		return timelineId;
	}
	public void setTimelineId(int timelineId) {
		this.timelineId = timelineId;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	
	public int getEventOrder() {
		return eventOrder;
	}
	public void setEventOrder(int eventOrder) {
		this.eventOrder = eventOrder;
	}	
}
