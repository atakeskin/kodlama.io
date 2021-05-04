package consolUI;

import java.time.LocalDate;

import entities.Campaign;
import entities.Game;
import entities.Sale;
import entities.SaleDTO;
import entities.User;
import manager.CampaignManager;
import manager.GameManager;
import manager.NationalityManager;
import manager.SaleManager;
import manager.UserManager;

public class Main {

	public static void main(String[] args) {		
	
		User user1 = new User(1,"Atalay","Keskin","11001100110",LocalDate.of(1985, 10, 21));		
		UserManager userManager = new UserManager(new NationalityManager());
		userManager.add(user1);
		userManager.update(user1);
		//userManager.delete(user1);
		
		Game game1 = new Game(1,"FarCry");		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1 = new Campaign(1,"Süper indirim Kampanyası",35);
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
