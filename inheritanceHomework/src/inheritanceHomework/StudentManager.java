package inheritanceHomework;

public class StudentManager extends UserManager {
	@Override
	public void addToCourse(User user) {
		
		System.out.println(user.getName() + " adl� ��renci bu kursa eklendi.");
	}
	
	public void attendance(Student student) {
		
		System.out.println(student.getName() + " Yoklaman�z al�nm��t�r.Dersi dinlemeye geri d�nebilirsiniz.");
	}
	


}
