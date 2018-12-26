package com.reigninbinary.bloodscribe.providers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.bloodscribe.db.dto.UserIdentityType;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItem;
import com.reigninbinary.bloodscribe.db.dto.UserProfileItemType;
import com.reigninbinary.core.CoreConfig;


public class UserProviderImpl implements UserProvider {
	
    private static class UserProviderInstance {
    	
    	private static UserProvider INSTANCE = null;
    	private static BloodscribeException EXCEPTION = null;
    	
        static {
    		try {		
    			INSTANCE = (UserProvider) 
    				Class.forName(getProviderClass())
    					.getDeclaredConstructor().newInstance();
    		} 
    		catch (ClassNotFoundException | InstantiationException | 
    				IllegalAccessException | IllegalArgumentException | 
    				InvocationTargetException | NoSuchMethodException | SecurityException e) {	
    			
    			EXCEPTION = new BloodscribeException(e);
    		}
        }
    }
    
	private static String getProviderClass() {
		
		final String USER_PROVIDER = "USER_PROVIDER";
		
		return CoreConfig.getConfigParam(USER_PROVIDER, StringUtils.EMPTY);

	}
	
	private static UserProvider getInstance() throws BloodscribeException {
		
		if (UserProviderInstance.EXCEPTION != null) {
			
			throw UserProviderInstance.EXCEPTION;
		}		
		return UserProviderInstance.INSTANCE;
	}

	@Override
	public User getUserById(int idUser) throws BloodscribeException {
		
		return getInstance().getUserById(idUser);
	}

	@Override
	public User getUserByIdentityId(String idIdentity) throws BloodscribeException {
		
		return getInstance().getUserByIdentityId(idIdentity);
	}

	@Override
	public User getUserByEmailAddress(String emailAddress) throws BloodscribeException {
		
		return getInstance().getUserByEmailAddress(emailAddress);
	}

	@Override
	public List<UserProfileItem> getUserProfileItems(int idUser) throws BloodscribeException {
		
		return getInstance().getUserProfileItems(idUser);
	}

	@Override
	public List<User> getUsers() throws BloodscribeException {
		
		return getInstance().getUsers();
	}

	@Override
	public List<UserIdentityType> getUserIdentityTypes() throws BloodscribeException {
		
		return getInstance().getUserIdentityTypes();
	}

	@Override
	public List<UserProfileItemType> getUserProfileItemTypes() throws BloodscribeException {
		
		return getInstance().getUserProfileItemTypes();
	}

	@Override
	public void saveUser(User user) throws BloodscribeException {
		
		getInstance().saveUser(user);
	}

	@Override
	public void saveUserProfileItem(UserProfileItem profileItem) throws BloodscribeException {
		
		getInstance().saveUserProfileItem(profileItem);
	}

	@Override
	public void saveUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException {
		
		getInstance().saveUserProfileItemType(profileItemType);
	}

	@Override
	public void saveUserIdentityType(UserIdentityType identityType) throws BloodscribeException {
		
		getInstance().saveUserIdentityType(identityType);
	}

	@Override
	public void deleteUser(User saveUserProfileItemType) throws BloodscribeException {
		
		getInstance().deleteUser(saveUserProfileItemType);
	}

	@Override
	public void deleteUserProfileItem(UserProfileItem profileItem) throws BloodscribeException {
		
		getInstance().deleteUserProfileItem(profileItem);
	}

	@Override
	public void deleteUserProfileItemType(UserProfileItemType profileItemType) throws BloodscribeException {
		
		getInstance().deleteUserProfileItemType(profileItemType);
	}

	@Override
	public void deleteUserIdentityType(UserIdentityType identityType) throws BloodscribeException {
		
		getInstance().deleteUserIdentityType(identityType);
	}
}
