package com.reigninbinary.bloodscribe.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.BaseLocationType;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocation;
import com.reigninbinary.bloodscribe.db.dto.GameWorldLocationType;
import com.reigninbinary.bloodscribe.db.dto.LocationDescription;
import com.reigninbinary.bloodscribe.db.dto.LocationTimeline;


public interface LocationProvider {

	public BaseLocationType getBaseLocationTypeById(int idLocationType) throws BloodscribeException;
	public List<BaseLocationType> getBaseLocationTypes() throws BloodscribeException;	

	public GameWorldLocationType getGameWorldLocationTypeById(int idGameWorld, int idLocationType) throws BloodscribeException;
	public List<GameWorldLocationType> getLocationTypesByGameWorld(int idGameWorld) throws BloodscribeException;
	
	public GameWorldLocation getLocationById(int idLocation) throws BloodscribeException;
	public List<GameWorldLocation> getLocationsByParent(int idParentLocation) throws BloodscribeException;
	public List<GameWorldLocation> getLocationsByGameWorld(int idGameWorld) throws BloodscribeException;
	public List<GameWorldLocation> getLocationsWithNoParent(int idGameWorld) throws BloodscribeException;
	
	public LocationDescription getLocationDescriptionById(int idDescription) throws BloodscribeException;
	public List<LocationDescription> getLocationDescriptions(int idLocation) throws BloodscribeException;
	
	public LocationTimeline getLocationTimelineById(int idTimeline) throws BloodscribeException;
	public List<LocationTimeline> getLocationTimelines(int idLocation) throws BloodscribeException;	
	
	public void saveBaseLocationType(BaseLocationType type) throws BloodscribeException;
	public void saveGameWorldLocationType(GameWorldLocationType type) throws BloodscribeException;
	public void saveGameWorldLocation(GameWorldLocation location) throws BloodscribeException;
	public void saveLocationDescription(LocationDescription descripton) throws BloodscribeException;
	public void saveLocationTimeline(LocationTimeline timeline) throws BloodscribeException;
}
