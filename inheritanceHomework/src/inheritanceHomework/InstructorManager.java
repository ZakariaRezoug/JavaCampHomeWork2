package inheritanceHomework;

public class InstructorManager extends UserManager {
	@Override
	public void addToCourse(User user) {
		
		System.out.println(user.getName() + " bu kursa eklendiniz.Ders program�n�z� ve projeleri d�zenleyebilirsiniz.");
	}
	public void addHomework() {
		
		System.out.println("Sisteme �dev eklediniz.");
	}
	
	
	

}
