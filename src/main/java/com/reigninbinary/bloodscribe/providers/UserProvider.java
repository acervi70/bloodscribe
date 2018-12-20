package com.reigninbinary.bloodscribe.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;


public interface UserProvider {

	public User getUserById(int idUser) throws BloodscribeException;
	public User getUserByIdentityId(String idIdentity) throws BloodscribeException;
	public User getUserByEmailAddress(String emailAddress) throws BloodscribeException;

	public List<UserProfileItem> getUserProfileItems(int idUser) throws BloodscribeException;

	public List<User> getUsers() throws BloodscribeException;
	public List<UserIdentityType> getUserIdentityTypes() throws BloodscribeException;
	public List<UserProfileItemType> getUserProfileItemTypes() throws BloodscribeException;
	
	public void saveUser(User user) throws BloodscribeException;
	public void saveUserProfileItem(UserProfileItem profileItem) throws BloodscribeException;
	public void saveUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException;
	public void saveUserIdentityType(UserIdentityType identityType) throws BloodscribeException;
	
	public void deleteUser(User user) throws BloodscribeException;
	public void deleteUserProfileItem(UserProfileItem profileItem) throws BloodscribeException;
	public void deleteUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException;
	public void deleteUserIdentityType(UserIdentityType identityType) throws BloodscribeException;
}
