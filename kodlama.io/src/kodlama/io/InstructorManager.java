package kodlama.io;

public class InstructorManager extends UserManager{
	
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + ", ��retmen giri� yapt�.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + ", ��retmen yeni kay�t yap�ld�.");
	}

	public void addInsstructorToCourse(User user) {
		
		System.out.println(user.getFirstName()+", "+user.getCourseId() + " kursuna ��retmen olarak kayd�n�z olu�turuldu.");
		
	}
}
