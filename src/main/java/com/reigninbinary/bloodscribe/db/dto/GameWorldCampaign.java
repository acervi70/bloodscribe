package com.reigninbinary.bloodscribe.db.dto;

public class GameWorldCampaign {

	private int gameWorldCampaignId;
	private int gameWorldId;
	private int campaignId;
	
	public int getGameWorldCampaignId() {
		return gameWorldCampaignId;
	}
	public void setGameWorldCampaignId(int gameWorldCampaignId) {
		this.gameWorldCampaignId = gameWorldCampaignId;
	}
	public int getGameWorldId() {
		return gameWorldId;
	}
	public void setGameWorldId(int gameWorldId) {
		this.gameWorldId = gameWorldId;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
}
