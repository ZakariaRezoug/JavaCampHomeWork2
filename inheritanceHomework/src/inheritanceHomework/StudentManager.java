package inheritanceHomework;

public class StudentManager extends UserManager {
	@Override
	public void addToCourse(User user) {
		
		System.out.println(user.getName() + " adlý öðrenci bu kursa eklendi.");
	}
	
	public void attendance(Student student) {
		
		System.out.println(student.getName() + " Yoklamanýz alýnmýþtýr.Dersi dinlemeye geri dönebilirsiniz.");
	}
	


}
