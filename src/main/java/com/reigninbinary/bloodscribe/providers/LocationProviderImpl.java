package com.reigninbinary.bloodscribe.providers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;
import com.reigninbinary.core.CoreConfig;


public class LocationProviderImpl implements LocationProvider {

    private static class LocationProviderInstance {
    	
    	private static LocationProvider INSTANCE = null;
    	private static BloodscribeException EXCEPTION = null;
    	
        static {
    		try {		
    			INSTANCE = (LocationProvider) 
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
		
		final String LOCATION_PROVIDER = "LOCATION_PROVIDER";
		
		return CoreConfig.getConfigParam(LOCATION_PROVIDER, StringUtils.EMPTY);

	}
	
	private static LocationProvider getInstance() throws BloodscribeException {
		
		if (LocationProviderInstance.EXCEPTION != null) {
			
			throw LocationProviderInstance.EXCEPTION;
		}		
		return LocationProviderInstance.INSTANCE;
	}

	@Override
	public BaseLocationType getBaseLocationTypeById(int idLocationType) throws BloodscribeException {
		
		return getInstance().getBaseLocationTypeById(idLocationType);
	}

	@Override
	public List<BaseLocationType> getBaseLocationTypes() throws BloodscribeException {

		return getInstance().getBaseLocationTypes();
	}

	@Override
	public GameWorldLocationType getGameWorldLocationTypeById(int idGameWorld, int idLocationType)
			throws BloodscribeException {

		return getInstance().getGameWorldLocationTypeById(idGameWorld, idLocationType);
	}

	@Override
	public List<GameWorldLocationType> getLocationTypesByGameWorld(int idGameWorld) throws BloodscribeException {

		return getInstance().getLocationTypesByGameWorld(idGameWorld);
	}

	@Override
	public GameWorldLocation getLocationById(int idLocation) throws BloodscribeException {

		return getInstance().getLocationById(idLocation);
	}

	@Override
	public List<GameWorldLocation> getLocationsByParent(int idParentLocation) throws BloodscribeException {

		return getInstance().getLocationsByParent(idParentLocation);
	}

	@Override
	public List<GameWorldLocation> getLocationsByGameWorld(int idGameWorld) throws BloodscribeException {

		return getInstance().getLocationsByGameWorld(idGameWorld);
	}

	@Override
	public List<GameWorldLocation> getLocationsWithNoParent(int idGameWorld) throws BloodscribeException {

		return getInstance().getLocationsWithNoParent(idGameWorld);
	}

	@Override
	public LocationDescription getLocationDescriptionById(int idDescription) throws BloodscribeException {

		return getInstance().getLocationDescriptionById(idDescription);
	}

	@Override
	public List<LocationDescription> getLocationDescriptions(int idLocation) throws BloodscribeException {

		return getInstance().getLocationDescriptions(idLocation);
	}

	@Override
	public LocationTimeline getLocationTimelineById(int idTimeline) throws BloodscribeException {

		return getInstance().getLocationTimelineById(idTimeline);
	}

	@Override
	public List<LocationTimeline> getLocationTimelines(int idLocation) throws BloodscribeException {

		return getInstance().getLocationTimelines(idLocation);
	}

	@Override
	public void saveBaseLocationType(BaseLocationType type) throws BloodscribeException {

		getInstance().saveBaseLocationType(type);
	}

	@Override
	public void saveGameWorldLocationType(GameWorldLocationType type) throws BloodscribeException {

		getInstance().saveGameWorldLocationType(type);
	}

	@Override
	public void saveGameWorldLocation(GameWorldLocation location) throws BloodscribeException {

		getInstance().saveGameWorldLocation(location);
	}

	@Override
	public void saveLocationDescription(LocationDescription descripton) throws BloodscribeException {

		getInstance().saveLocationDescription(descripton);
	}

	@Override
	public void saveLocationTimeline(LocationTimeline timeline) throws BloodscribeException {

		getInstance().saveLocationTimeline(timeline);
	}
}
