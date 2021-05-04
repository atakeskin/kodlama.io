package oyunProject.Entities;

public class User extends Person implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String birdOfYear;
	
	public User() {
		super();
	}

	public User(int id, String identityNumber, String firstName, String lastName, String birdOfYear) {
		
		super(identityNumber);
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birdOfYear = birdOfYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirdOfYear() {
		return birdOfYear;
	}

	public void setBirdOfYear(String birdOfYear) {
		this.birdOfYear = birdOfYear;
	}	

}
