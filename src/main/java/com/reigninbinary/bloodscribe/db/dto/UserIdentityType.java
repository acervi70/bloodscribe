package com.reigninbinary.bloodscribe.db.dto;

public class UserIdentityType {

	private int 	identityTypeId;
	private String 	identityType;
	private String 	description;
	
	public int getIdentityTypeId() {
		return identityTypeId;
	}
	public void setIdentityTypeId(int identityTypeId) {
		this.identityTypeId = identityTypeId;
	}

	public String getIdentityType() {
		return identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
