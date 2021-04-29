package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Zakaria");
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.addToCourse(student1);
		studentManager.attendance(student1);
		
		instructorManager.addToCourse(instructor1);
		instructorManager.addHomework();

	}

}
