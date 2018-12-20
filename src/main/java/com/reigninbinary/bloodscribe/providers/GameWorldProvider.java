package com.reigninbinary.bloodscribe.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;


public interface GameWorldProvider {

	public GameWorld getGameWorldById(int idGameWorld) throws BloodscribeException;
	public List<GameWorld> getGameWorldsByUser(int idUser) throws BloodscribeException;
	
	public GameWorldDescription getGameWorldDescriptionById(int idDescription) throws BloodscribeException;
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld) throws BloodscribeException;
	
	public void saveGameWorld(GameWorld gameWorld) throws BloodscribeException;
	public void saveGameWorldDescription(GameWorldDescription description) throws BloodscribeException;
}
