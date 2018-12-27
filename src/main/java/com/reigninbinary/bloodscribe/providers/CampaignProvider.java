package com.reigninbinary.bloodscribe.providers;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.Campaign;
import com.reigninbinary.bloodscribe.db.dto.CampaignInformation;
import com.reigninbinary.bloodscribe.db.dto.CampaignLog;

public interface CampaignProvider {

	public Campaign getCampaign(int idCampaign) throws BloodscribeException;
	public List<Campaign> getCampaigns(int idGameWorld) throws BloodscribeException;
	
	public CampaignInformation getCampaignInformation(int idInformation) throws BloodscribeException;
	public List<CampaignInformation> getAllCampaignInformation(int idCampaign) throws BloodscribeException;
	
	public CampaignLog getCampaignLog(int idCampaignLog) throws BloodscribeException;
	public List<CampaignLog> getCampaignLogs(int idCampaign) throws BloodscribeException;
}
