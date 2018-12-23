package com.reigninbinary.bloodscribe.api;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.bloodscribe.db.util.DatabaseUtils;
import com.reigninbinary.bloodscribe.db.util.UserIdentity;
import com.reigninbinary.bloodscribe.providers.BloodscribeProviders;
import com.reigninbinary.bloodscribe.providers.UserProvider;


public class UserApi implements UserProvider {

	private UserProvider userProvider;
	
	public UserApi() throws BloodscribeException {
		
		userProvider = BloodscribeProviders.getUserProvider();
	}
	
	@Override
	public User getUserById(int idUser) throws BloodscribeException {

		return userProvider.getUserById(idUser);
	}

	@Override
	public User getUserByIdentityId(String idIdentity) throws BloodscribeException {
		
		return userProvider.getUserByIdentityId(idIdentity);
	}

	@Override
	public User getUserByEmailAddress(String emailAddress) throws BloodscribeException {

		return userProvider.getUserByEmailAddress(emailAddress);
	}

	@Override
	public List<UserProfileItem> getUserProfileItems(int idUser) throws BloodscribeException {

		return userProvider.getUserProfileItems(idUser);
	}

	@Override
	public List<User> getUsers() throws BloodscribeException {

		return userProvider.getUsers();
	}

	@Override
	public List<UserIdentityType> getUserIdentityTypes() throws BloodscribeException {
		
		return userProvider.getUserIdentityTypes();
	}

	@Override
	public List<UserProfileItemType> getUserProfileItemTypes() throws BloodscribeException {
		
		return userProvider.getUserProfileItemTypes();
	}

	@Override
	public void saveUser(User user) throws BloodscribeException {
		
		// TODO: this can be removed when login is implemented.
		if (StringUtils.isEmpty(user.getIdentityId())) {
			UserIdentity identity = DatabaseUtils.generateDefaultUserIdentity();
			user.setIdentityId(identity.getIdentityId());
			user.setIdentityTypeId(identity.getIdentityTypeId());
		}

		userProvider.saveUser(user);
	}

	@Override
	public void saveUserProfileItem(UserProfileItem profileItem) throws BloodscribeException {

		userProvider.saveUserProfileItem(profileItem);
	}

	@Override
	public void saveUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException {

		userProvider.saveUserProfileItemType(profileItemType);
	}

	@Override
	public void saveUserIdentityType(UserIdentityType identityType) throws BloodscribeException {

		userProvider.saveUserIdentityType(identityType);
	}

	@Override
	public void deleteUser(User user) throws BloodscribeException {

		userProvider.deleteUser(user);
	}

	@Override
	public void deleteUserProfileItem(UserProfileItem profileItem) throws BloodscribeException {

		userProvider.deleteUserProfileItem(profileItem);
	}

	@Override
	public void deleteUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException {

		userProvider.deleteUserProfileItemType(profileItemType);
	}

	@Override
	public void deleteUserIdentityType(UserIdentityType identityType) throws BloodscribeException {

		userProvider.deleteUserIdentityType(identityType);
	}
}
