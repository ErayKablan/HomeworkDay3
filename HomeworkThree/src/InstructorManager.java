
public class InstructorManager {
	
	public void addCourse(Instructor instructor1) {
		System.out.println("Kurs 1: " + instructor1.getCourse());
	}
	
	public void addCourse2(Instructor instructor2) {
		System.out.println("Kurs 2: " + instructor2.getCourse2()); 
	}
	
	public void addTeacher(Instructor instructor) {
		System.out.println("E�itmen ad�: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

}
