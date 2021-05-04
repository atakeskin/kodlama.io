package oyunProject;

import mernisService.Concrate.NationalityManager;
import oyunProject.Entities.Campaign;
import oyunProject.Entities.Game;
import oyunProject.Entities.Sale;
import oyunProject.Entities.SaleDTO;
import oyunProject.Entities.User;
import oyunProject.Manager.CampaignManager;
import oyunProject.Manager.GameManager;
import oyunProject.Manager.SaleManager;
import oyunProject.Manager.UserManager;

public class Main {

	public static void main(String[] args) {
		
	
		User user1 = new User(1,"123456789","Atalay","Keskin","1980");
		
		UserManager userManager = new UserManager(new NationalityManager());
		userManager.add(user1);
		userManager.update(user1);
		//userManager.delete(user1);
		
		Game game1 = new Game(1,"FarCry");		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1 = new Campaign(1,"Süper indirim Kampanyasý",35);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		//campaignManager.delete(campaign1);
		
		Sale sale1 = new Sale(1,game1.getId(),350);
		sale1.setCampaignId(campaign1.getId());
		
		SaleDTO saleDto = new SaleDTO(game1.getName(),
				user1.getFirstName()+" "+user1.getLastName(),
				campaign1.getName(),sale1.getPrice(),campaign1.getDiscountRate());
		
		SaleDTO saleDto2 = new SaleDTO(game1.getName(),
				user1.getFirstName()+" "+user1.getLastName(),
				campaign1.getName(),sale1.getPrice());
		
		SaleManager saleManager = new SaleManager(new CampaignManager());
		
		saleManager.salesGaming(saleDto);
		

		
	}

}
