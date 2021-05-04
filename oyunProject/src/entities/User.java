package entities;

import java.time.LocalDate;

public class User implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String identityNumber;
	private LocalDate dateOfBird;
	
	public User() {
		super();
	}

	public User(int id, String firstName, String lastName, String identityNumber, LocalDate dateOfBird) {
		
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBird = dateOfBird;
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

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getDateOfBird() {
		return dateOfBird;
	}

	public void setDateOfBird(LocalDate dateOfBird) {
		this.dateOfBird = dateOfBird;
	}	

}
