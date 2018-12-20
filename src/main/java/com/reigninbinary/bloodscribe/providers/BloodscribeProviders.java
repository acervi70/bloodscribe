package com.reigninbinary.bloodscribe.providers;

import java.lang.reflect.InvocationTargetException;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.core.CoreConfig;


public class BloodscribeProviders {
	
	public static UserProvider getUserProvider() throws BloodscribeException {
		
		try {		
			return (UserProvider) 
				Class.forName(getUserProviderClass())
					.getDeclaredConstructor().newInstance();
		} 
		catch (ClassNotFoundException | InstantiationException | 
				IllegalAccessException | IllegalArgumentException | 
				InvocationTargetException | NoSuchMethodException | SecurityException e) {	
			
			throw new BloodscribeException(e);
		}
	}
	
	public static GameWorldProvider getGameWorldProvider() throws BloodscribeException {
		
		try {		
			return (GameWorldProvider) 
				Class.forName(getGameWorldProviderClass())
					.getDeclaredConstructor().newInstance();
		} 
		catch (ClassNotFoundException | InstantiationException | 
				IllegalAccessException | IllegalArgumentException | 
				InvocationTargetException | NoSuchMethodException | SecurityException e) {		
			
			throw new BloodscribeException(e);
		}
	}
	
	public static LocationProvider getLocationProvider() throws BloodscribeException {
		
		try {		
			return (LocationProvider) 
				Class.forName(getLocationProviderClass())
					.getDeclaredConstructor().newInstance();
		} 
		catch (ClassNotFoundException | InstantiationException | 
				IllegalAccessException | IllegalArgumentException | 
				InvocationTargetException | NoSuchMethodException | SecurityException e) {	
			
			throw new BloodscribeException(e);
		}
	}
	
	private static String getUserProviderClass() {
		
		final String USER_PROVIDER= "USER_PROVIDER";
		
		return CoreConfig.getConfigParam(USER_PROVIDER, null);

	}
	
	private static String getGameWorldProviderClass() {
		
		final String GAMEWORLD_PROVIDER = "GAMEWORLD_PROVIDER";
		
		return CoreConfig.getConfigParam(GAMEWORLD_PROVIDER, null);
	}
	
	private static String getLocationProviderClass() {
		
		final String LOCATION_PROVIDER = "LOCATION_PROVIDER";
		
		return CoreConfig.getConfigParam(LOCATION_PROVIDER, null);
	}
}
