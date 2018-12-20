package com.reigninbinary.bloodscribe.db.dto;

import java.util.Date;

public class GameWorld {

	private int gameWorldId;
	private String gameWorld;
	private String description;
	private boolean readOnly;
	private Date createdDt;
	private Date updatedDt;
	
	public int getGameWorldId() {
		return gameWorldId;
	}
	public void setGameWorldId(int gameWorldId) {
		this.gameWorldId = gameWorldId;
	}
	
	public String getGameWorld() {
		return gameWorld;
	}
	public void setGameWorld(String gameWorld) {
		this.gameWorld = gameWorld;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	
	public Date getUpdatedDt() {
		return updatedDt;
	}
	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}
}
