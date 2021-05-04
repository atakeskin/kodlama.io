package oyunProject.Manager;

import oyunProject.Entities.Campaign;
import oyunProject.Service.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("%"+campaign.getDiscountRate()+" oran�nda indirim yapan "+campaign.getName()+" eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		campaign.setDiscountRate(campaign.getDiscountRate()+10);
		System.out.println(campaign.getName()+" %"+campaign.getDiscountRate()+" oran� olarak yeniden g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getName()+" silindi.");
		
	}

}
