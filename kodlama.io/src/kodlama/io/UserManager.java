package kodlama.io;

public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullanýcýsý eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullanýcýsý silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullanýcý bilgileri güncellendi.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+" kullanýcýsý sisteme giriþ yaptý.");
	}
	
}
