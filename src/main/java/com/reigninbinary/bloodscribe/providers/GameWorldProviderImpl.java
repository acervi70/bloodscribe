package com.reigninbinary.bloodscribe.providers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.GameWorld;
import com.reigninbinary.bloodscribe.db.dto.GameWorldDescription;
import com.reigninbinary.bloodscribe.db.dto.User;
import com.reigninbinary.core.CoreConfig;


public class GameWorldProviderImpl implements GameWorldProvider {

    private static class GameWorldProviderInstance {
    	
    	private static GameWorldProvider 	INSTANCE 	= null;
    	private static BloodscribeException EXCEPTION 	= null;
    	
        static {
    		try {		
    			INSTANCE = (GameWorldProvider) 
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
		
		final String GAMEWORLD_PROVIDER = "GAMEWORLD_PROVIDER";
		
		return CoreConfig.getConfigParam(GAMEWORLD_PROVIDER, StringUtils.EMPTY);
	}
	
	private static GameWorldProvider getInstance() throws BloodscribeException {
		
		if (GameWorldProviderInstance.EXCEPTION != null) {
			
			throw GameWorldProviderInstance.EXCEPTION;
		}		
		return GameWorldProviderInstance.INSTANCE;
	}

	@Override
	public GameWorld getGameWorldById(int idGameWorld) throws BloodscribeException {
		
		return getInstance().getGameWorldById(idGameWorld);
	}

	@Override
	public List<GameWorld> getGameWorldsByUser(int idUser) throws BloodscribeException {
		
		return getInstance().getGameWorldsByUser(idUser);
	}

	@Override
	public GameWorldDescription getGameWorldDescriptionById(int idDescription) throws BloodscribeException {
		
		return getInstance().getGameWorldDescriptionById(idDescription);
	}

	@Override
	public List<GameWorldDescription> getGameWorldDescriptions(int idGameWorld) throws BloodscribeException {
		
		return getInstance().getGameWorldDescriptions(idGameWorld);
	}

	@Override
	public void createGameWorld(User user, GameWorld gameWorld) throws BloodscribeException {
		
		getInstance().createGameWorld(user, gameWorld);
	}

	@Override
	public void updateGameWorld(GameWorld gameWorld) throws BloodscribeException {
		
		getInstance().updateGameWorld(gameWorld);
	}

	@Override
	public void saveGameWorldDescription(GameWorldDescription description) throws BloodscribeException {
		
		getInstance().saveGameWorldDescription(description);
	}
}
