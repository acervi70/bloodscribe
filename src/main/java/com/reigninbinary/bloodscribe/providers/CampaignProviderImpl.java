package com.reigninbinary.bloodscribe.providers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.reigninbinary.bloodscribe.BloodscribeException;
import com.reigninbinary.bloodscribe.db.dto.Campaign;
import com.reigninbinary.bloodscribe.db.dto.CampaignInformation;
import com.reigninbinary.bloodscribe.db.dto.CampaignLog;
import com.reigninbinary.core.CoreConfig;


public class CampaignProviderImpl implements CampaignProvider {

    private static class CampaignProviderInstance {
    	
    	private static CampaignProvider INSTANCE = null;
    	private static BloodscribeException EXCEPTION = null;
    	
        static {
    		try {		
    			INSTANCE = (CampaignProvider) 
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
		
		final String CAMPAIGN_PROVIDER = "CAMPAIGN_PROVIDER";
		
		return CoreConfig.getConfigParam(CAMPAIGN_PROVIDER, StringUtils.EMPTY);
	}
	
	private static CampaignProvider getInstance() throws BloodscribeException {
		
		if (CampaignProviderInstance.EXCEPTION != null) {
			
			throw CampaignProviderInstance.EXCEPTION;
		}		
		return CampaignProviderInstance.INSTANCE;
	}

	@Override
	public Campaign getCampaign(int idCampaign) throws BloodscribeException {
		
		return getInstance().getCampaign(idCampaign);
	}

	@Override
	public List<Campaign> getCampaigns(int idGameWorld) throws BloodscribeException {

		return getInstance().getCampaigns(idGameWorld);
	}

	@Override
	public CampaignInformation getCampaignInformation(int idInformation) throws BloodscribeException {

		return getInstance().getCampaignInformation(idInformation);
	}

	@Override
	public List<CampaignInformation> getAllCampaignInformation(int idCampaign) throws BloodscribeException {
	
		return getInstance().getAllCampaignInformation(idCampaign);
	}

	@Override
	public CampaignLog getCampaignLog(int idCampaignLog) throws BloodscribeException {
		
		return getInstance().getCampaignLog(idCampaignLog);
	}

	@Override
	public List<CampaignLog> getCampaignLogs(int idCampaign) throws BloodscribeException {
	
		return getInstance().getCampaignLogs(idCampaign);
	}
}
