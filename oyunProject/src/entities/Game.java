package entities;

public class Game implements Entity {
	
	private int id;
	private String name;
	
	public Game() {
		super();
	}

	public Game(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
