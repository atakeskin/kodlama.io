package manager;

import entities.SaleDTO;
import service.CampaignService;
import service.SaleService;

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
					saleDto.getUserName() + " adlı oyuncuya "+
					saleDto.getGameName()+" adlı oyun "+
					saleDto.getDiscountedPrice()+" fiyatla satış yapıldı.");
		} else {
			System.out.println(
					saleDto.getUserName() + " adlı oyuncuya "+
					saleDto.getGameName()+" adlı oyun "+
					saleDto.getPrice()+" fiyatla satış yapıldı.");
		}
		
		
	}
	
	private boolean CheckOfDiscountedRate(SaleDTO saleDto) {
		if (saleDto.getDiscountRate()!=0) {
			return true;
		}
		return false;
	}

}
