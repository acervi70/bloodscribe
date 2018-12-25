package com.reigninbinary.bloodscribe.db.dto;


public class UserProfileItem {

	private int userId;
	private int itemId;
	private String itemValue;
	private int userProfileItemTypeId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public String getItemValue() {
		return itemValue;
	}
	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}
	
	public int getUserProfileItemTypeId() {
		return userProfileItemTypeId;
	}
	public void setUserProfileItemTypeId(int userProfileItemTypeId) {
		
		this.userProfileItemTypeId = userProfileItemTypeId;
	}
}
