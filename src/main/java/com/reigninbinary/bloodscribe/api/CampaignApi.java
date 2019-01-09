package com.reigninbinary.bloodscribe.api;

import java.util.List;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.Campaign;
import com.reigninbinary.bloodscribe.db.dto.CampaignInformation;
import com.reigninbinary.bloodscribe.db.dto.CampaignLog;
import com.reigninbinary.bloodscribe.providers.CampaignProvider;
import com.reigninbinary.bloodscribe.providers.CampaignProviderImpl;

public class CampaignApi implements CampaignProvider {
	
	private CampaignProvider campaignProvider;

	public CampaignApi() {

		campaignProvider = new CampaignProviderImpl();
	}

	@Override
	public Campaign getCampaign(int idCampaign) throws BloodscribeException {
		
		return campaignProvider.getCampaign(idCampaign);
	}

	@Override
	public List<Campaign> getCampaigns(int idGameWorld) throws BloodscribeException {
		
		return campaignProvider.getCampaigns(idGameWorld);
	}

	@Override
	public CampaignInformation getCampaignInformation(int idInformation) throws BloodscribeException {
		
		return campaignProvider.getCampaignInformation(idInformation);
	}

	@Override
	public List<CampaignInformation> getAllCampaignInformation(int idCampaign) throws BloodscribeException {

		return campaignProvider.getAllCampaignInformation(idCampaign);
	}

	@Override
	public CampaignLog getCampaignLog(int idCampaignLog) throws BloodscribeException {

		return campaignProvider.getCampaignLog(idCampaignLog);
	}

	@Override
	public List<CampaignLog> getCampaignLogs(int idCampaign) throws BloodscribeException {

		return campaignProvider.getCampaignLogs(idCampaign);
	}
}
