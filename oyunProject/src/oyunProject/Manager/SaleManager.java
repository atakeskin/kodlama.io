package oyunProject.Manager;

import oyunProject.Entities.SaleDTO;
import oyunProject.Service.CampaignService;
import oyunProject.Service.SaleService;

public class SaleManager implements SaleService {
	
	private CampaignService campaignService;
	
	

	public SaleManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}



	@Override
	public void salesGaming(SaleDTO saleDto) {
		
		if (CheckOfDiscountedRate(saleDto)) {
			System.out.println(
					saleDto.getUserName() + " adl� oyuncuya "+
					saleDto.getGameName()+" adl� oyun "+
					saleDto.getDiscountedPrice()+" fiyatla sat��� yap�ld�.");
		} else {
			System.out.println(
					saleDto.getUserName() + " adl� oyuncuya "+
					saleDto.getGameName()+" adl� oyun "+
					saleDto.getPrice()+" fiyatla sat��� yap�ld�.");
		}
		
		
	}
	
	private boolean CheckOfDiscountedRate(SaleDTO saleDto) {
		if (saleDto.getDiscountRate()!=0) {
			return true;
		}
		return false;
	}

}
