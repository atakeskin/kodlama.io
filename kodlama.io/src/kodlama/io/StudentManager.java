package kodlama.io;

public class StudentManager extends UserManager {
	
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + ", ��rencisi sisteme giri� yapt�.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + ", ��rencisi yeni kay�t oldu.");
	}

	public void addStudentToCourse(User user) {
		
		System.out.println(user.getFirstName()+", "+user.getCourseId() + " kursuna kayd�n�z yap�ld�.");
		
	}

}
