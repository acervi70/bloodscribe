package com.reigninbinary.bloodscribe.api;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.providers.GameWorldProvider;
import com.reigninbinary.bloodscribe.providers.GameWorldProviderImpl;


public class GameWorldApi implements GameWorldProvider {

	private GameWorldProvider gameWorldProvider;
	
	public GameWorldApi() throws BloodscribeException {
		
		gameWorldProvider = new GameWorldProviderImpl();
	}

	@Override
	public GameWorld getGameWorldById(int idGameWorld) throws BloodscribeException {
		
		return gameWorldProvider.getGameWorldById(idGameWorld);
	}

	@Override
	public List<GameWorld> getGameWorldsByUser(int idUser) throws BloodscribeException {
		
		return gameWorldProvider.getGameWorldsByUser(idUser);
	}

	@Override
	public GameWorldDescription getGameWorldDescriptionById(int idDescription) throws BloodscribeException {

		return gameWorldProvider.getGameWorldDescriptionById(idDescription);
	}

	@Override
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld) throws BloodscribeException {

		return gameWorldProvider.getGameWorldDescriptions(idGameWorld);
	}

	@Override
	public void saveGameWorld(GameWorld gameWorld) throws BloodscribeException {

		gameWorldProvider.saveGameWorld(gameWorld);
	}

	@Override
	public void saveGameWorldDescription(GameWorldDescription description) throws BloodscribeException {

		gameWorldProvider.saveGameWorldDescription(description);
	}

}
