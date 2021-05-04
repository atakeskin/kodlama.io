package oyunProject.Manager;

import oyunProject.Entities.Campaign;
import oyunProject.Service.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("%"+campaign.getDiscountRate()+" oranında indirim yapan "+campaign.getName()+" eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		campaign.setDiscountRate(campaign.getDiscountRate()+10);
		System.out.println(campaign.getName()+" %"+campaign.getDiscountRate()+" oranı olarak yeniden güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getName()+" silindi.");
		
	}

}
