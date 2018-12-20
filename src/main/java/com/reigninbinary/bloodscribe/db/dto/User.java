package com.reigninbinary.bloodscribe.db.dto;

import java.util.Date;


public class User {

	private int userId;
	private String identityId;
	private int identityTypeId;
	private String emailAddress;
	private Date createdDt;
	private Date updatedDt;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getIdentityId() {
		return identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	
	public int getIdentityTypeId() {
		return identityTypeId;
	}
	public void setIdentityTypeId(int identityTypeId) {
		this.identityTypeId = identityTypeId;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
