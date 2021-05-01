package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Atalay");
		student1.setLastName("Keskin");
		student1.setEmail("atalaykeskin@gmail.com");
		student1.setPassword("123456");
		student1.setAddress("Çanakkale");
		student1.setProfileFoto("ata.jpg");
		student1.setCourseId(1);
		
		Instructor teacher1 = new Instructor();
		teacher1.setId(1);
		teacher1.setFirstName("Engin");
		teacher1.setLastName("Demiroğ");
		teacher1.setEmail("engin@gmail.com");
		teacher1.setPassword("123456");
		teacher1.setAddress("Ankara");
		teacher1.setProfileFoto("enin.jpg");
		teacher1.setCourseId(1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
		studentManager.login(student1);
		studentManager.update(student1);
		studentManager.delete(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.register(teacher1);
		instructorManager.login(teacher1);
		instructorManager.update(teacher1);
		instructorManager.delete(teacher1);
		
		
		
	}

}
