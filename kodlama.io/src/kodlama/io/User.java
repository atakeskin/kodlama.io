package kodlama.io;

public class User {
	
	private int id;
	private int courseId;
	private String firstName;
	private String lastName;
	private String profileFoto;
	private String email;
	private String password;
	private String address;

	
	public User() {
		super();
	}

	public User(int id, int courseId, String firstName, String lastName, String profileFoto, String email, String password,
			String address) {
		this();
		this.id = id;
		this.courseId = courseId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileFoto = profileFoto;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
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

	public String getProfileFoto() {
		return profileFoto;
	}

	public void setProfileFoto(String profileFoto) {
		this.profileFoto = profileFoto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
	
}
