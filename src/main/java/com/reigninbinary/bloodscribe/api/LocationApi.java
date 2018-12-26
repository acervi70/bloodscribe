package com.reigninbinary.bloodscribe.api;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;
import com.reigninbinary.bloodscribe.providers.LocationProvider;
import com.reigninbinary.bloodscribe.providers.LocationProviderImpl;


public class LocationApi implements LocationProvider {

	private LocationProvider locationProvider;
	
	public LocationApi() throws BloodscribeException {
		
		locationProvider = new LocationProviderImpl();
	}

	@Override
	public BaseLocationType getBaseLocationTypeById(int idLocationType) throws BloodscribeException {

		return locationProvider.getBaseLocationTypeById(idLocationType);
	}

	@Override
	public List<BaseLocationType> getBaseLocationTypes() throws BloodscribeException {

		return locationProvider.getBaseLocationTypes();
	}

	@Override
	public GameWorldLocationType getGameWorldLocationTypeById(int idGameWorld, int idLocationType) throws BloodscribeException {

		return locationProvider.getGameWorldLocationTypeById(idGameWorld, idLocationType);
	}

	@Override
	public List<GameWorldLocationType> getLocationTypesByGameWorld(int idGameWorld) throws BloodscribeException {

		return locationProvider.getLocationTypesByGameWorld(idGameWorld);
	}

	@Override
	public GameWorldLocation getLocationById(int idLocation) throws BloodscribeException {

		return locationProvider.getLocationById(idLocation);
	}

	@Override
	public List<GameWorldLocation> getLocationsByParent(int idParentLocation) throws BloodscribeException {

		return locationProvider.getLocationsByParent(idParentLocation);
	}

	@Override
	public List<GameWorldLocation> getLocationsByGameWorld(int idGameWorld) throws BloodscribeException {

		return locationProvider.getLocationsByGameWorld(idGameWorld);
	}

	@Override
	public List<GameWorldLocation> getLocationsWithNoParent(int idGameWorld) throws BloodscribeException {

		return locationProvider.getLocationsWithNoParent(idGameWorld);
	}

	@Override
	public LocationDescription getLocationDescriptionById(int idDescription) throws BloodscribeException {

		return locationProvider.getLocationDescriptionById(idDescription);
	}

	@Override
	public List<LocationDescription> getLocationDescriptions(int idLocation) throws BloodscribeException {

		return locationProvider.getLocationDescriptions(idLocation);
	}

	@Override
	public LocationTimeline getLocationTimelineById(int idTimeline) throws BloodscribeException {

		return locationProvider.getLocationTimelineById(idTimeline);
	}

	@Override
	public List<LocationTimeline> getLocationTimelines(int idLocation) throws BloodscribeException {

		return locationProvider.getLocationTimelines(idLocation);
	}

	@Override
	public void saveBaseLocationType(BaseLocationType type) throws BloodscribeException {

		locationProvider.saveBaseLocationType(type);
	}

	@Override
	public void saveGameWorldLocationType(GameWorldLocationType type) throws BloodscribeException {

		locationProvider.saveGameWorldLocationType(type);

	}

	@Override
	public void saveGameWorldLocation(GameWorldLocation location) throws BloodscribeException {

		locationProvider.saveGameWorldLocation(location);
	}

	@Override
	public void saveLocationDescription(LocationDescription descripton) throws BloodscribeException {

		locationProvider.saveLocationDescription(descripton);
	}

	@Override
	public void saveLocationTimeline(LocationTimeline timeline) throws BloodscribeException {

		locationProvider.saveLocationTimeline(timeline);
	}
}
