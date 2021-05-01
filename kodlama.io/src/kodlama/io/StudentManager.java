package kodlama.io;

public class StudentManager extends UserManager {
	
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + ", öðrencisi sisteme giriþ yaptý.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + ", öðrencisi yeni kayýt oldu.");
	}

	public void addStudentToCourse(User user) {
		
		System.out.println(user.getFirstName()+", "+user.getCourseId() + " kursuna kaydýnýz yapýldý.");
		
	}

}
