package kodlama.io;

public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullan�c�s� eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullan�c�s� silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullan�c� bilgileri g�ncellendi.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullan�c�s� sisteme giri� yapt�.");
	}

}
