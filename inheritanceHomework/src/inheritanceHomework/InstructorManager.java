package inheritanceHomework;

public class InstructorManager extends UserManager {
	@Override
	public void addToCourse(User user) {
		
		System.out.println(user.getName() + " bu kursa eklendiniz.Ders programýnýzý ve projeleri düzenleyebilirsiniz.");
	}
	public void addHomework() {
		
		System.out.println("Sisteme ödev eklediniz.");
	}
	
	
	

}
