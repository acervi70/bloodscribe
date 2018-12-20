package com.reigninbinary.bloodscribe.db.dto;


public class GameWorldDescription {
	
	private int 	gameWorldId;
	private int 	descriptionId;
	private String 	description;
	private boolean visible;
	
	public int getGameWorldId() {
		return gameWorldId;
	}
	public void setGameWorldId(int gameWorldId) {
		this.gameWorldId = gameWorldId;
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
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
