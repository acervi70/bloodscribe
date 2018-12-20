package com.reigninbinary.bloodscribe.db.dto;


public class GameWorldLocation {

	private int 			gameWorldId;
	private int 			parentLocationId;
	private int 			locationId;
	private String 			location;
	private String 			description;
	private boolean 		visible;
	GameWorldLocationType 	gameWorldlocationType;
	
	public int getGameWorldId() {
		return gameWorldId;
	}
	public void setGameWorldId(int gameWorldId) {
		this.gameWorldId = gameWorldId;
	}
	
	public int getParentLocationId() {
		return parentLocationId;
	}
	public void setParentLocationId(int parentLocationId) {
		this.parentLocationId = parentLocationId;
	}
	
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public GameWorldLocationType getGameWorldlocationType() {
		return gameWorldlocationType;
	}
	public void setGameWorldlocationType(GameWorldLocationType gameWorldlocationType) {
		this.gameWorldlocationType = gameWorldlocationType;
	}
}