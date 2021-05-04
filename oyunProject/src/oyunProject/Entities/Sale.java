package oyunProject.Entities;

public class Sale implements Entity {
	
	private int id;
	private int gameId;
	private int userId;
	private int campaignId;
	private double price;

	
	public Sale() {
		super();
	}

	public Sale(int id, int gameId, double fiyat) {
		this();
		this.id = id;
		this.gameId = gameId;
		this.price = fiyat;
	}

	public int getId() {
		return id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double fiyat) {
		this.price = fiyat;
	}

}
