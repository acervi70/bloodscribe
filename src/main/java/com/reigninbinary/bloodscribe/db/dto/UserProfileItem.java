package com.reigninbinary.bloodscribe.db.dto;


public class UserProfileItem {

	private int userId;
	private int itemId;
	private String itemValue;
	private UserProfileItemType userProfileItemType;
	
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
	
	public UserProfileItemType getUserProfileItemType() {
		return userProfileItemType;
	}
	public void setUserProfileItemType(UserProfileItemType userProfileItemType) {
		this.userProfileItemType = userProfileItemType;
	}
}
