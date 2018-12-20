package com.reigninbinary.bloodscribe.db.dto;


public class UserGameWorld {

	private int userGameWorldId;
	private User user;
	private GameWorld gameWorld;
	
	public int getUserGameWorldId() {
		return userGameWorldId;
	}
	public void setUserGameWorldId(int userGameWorldId) {
		this.userGameWorldId = userGameWorldId;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public GameWorld getGameWorld() {
		return gameWorld;
	}
	public void setGameWorld(GameWorld gameWorld) {
		this.gameWorld = gameWorld;
	}
}
