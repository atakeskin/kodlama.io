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
					saleDto.getUserName() + " adlý oyuncuya "+
					saleDto.getGameName()+" adlý oyun "+
					saleDto.getDiscountedPrice()+" fiyatla satýþý yapýldý.");
		} else {
			System.out.println(
					saleDto.getUserName() + " adlý oyuncuya "+
					saleDto.getGameName()+" adlý oyun "+
					saleDto.getPrice()+" fiyatla satýþý yapýldý.");
		}
		
		
	}
	
	private boolean CheckOfDiscountedRate(SaleDTO saleDto) {
		if (saleDto.getDiscountRate()!=0) {
			return true;
		}
		return false;
	}

}
