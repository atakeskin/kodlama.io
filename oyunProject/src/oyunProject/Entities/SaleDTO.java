package oyunProject.Entities;

public class SaleDTO implements Dto {
	
	private String gameName;
	private String userName;
	private String campaignName;
	private double price;
	private int discountRate=0;
	private double discountedPrice;
	
	public SaleDTO() {
		super();
	}
	
	public SaleDTO(String gameName, String userName, String campaignName, double price) {
		super();
		this.gameName = gameName;
		this.userName = userName;
		this.campaignName = campaignName;
		this.price = price;
	}

	public SaleDTO(String gameName, String userName, String campaignName, double price, int discountRate) {
		super();
		this.gameName = gameName;
		this.userName = userName;
		this.campaignName = campaignName;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedPrice() {
		return this.price - (this.price * this.discountRate/100);
	}
	
	
}
