package kodlama.io;

public class InstructorManager extends UserManager{
	
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + ", öðretmen giriþ yaptý.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + ", öðretmen yeni kayýt yapýldý.");
	}

	public void addInsstructorToCourse(User user) {
		
		System.out.println(user.getFirstName()+", "+user.getCourseId() + " kursuna öðretmen olarak kaydýnýz oluþturuldu.");
		
	}
}
