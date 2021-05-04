package oyunProject.Entities;

public class Person {
	
	private int id;
	private String identityNumber;
	
	public Person() {
		
	}

	public Person(String identityNumber) {
		super();
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}	
	

}
