
public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Eray", "Kablan", "eraykablan1903@gmail.com");
		UserManager userManager = new UserManager();
		userManager.add(user1);
		System.out.println("-----------------------------------");
		
		
		Instructor instructor1 = new Instructor("Engin", "Demiroğ", "JAVA + REACT", "C# & ANGULAR");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addTeacher(instructor1);
		System.out.println("-----------------------------------");
		
		Instructor instructor2 = new Instructor("Engin", "Demiroğ", "JAVA + REACT",  "C# & ANGULAR");
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager.addCourse(instructor1);
		
		Instructor instructor3 = new Instructor("Engin", "Demiroğ", "JAVA + REACT",  "C# & ANGULAR");
		InstructorManager instructorManager3 = new InstructorManager();
		instructorManager.addCourse2(instructor2);
		System.out.println("-----------------------------------");
		
		Student student = new Student("Eray", "Kablan", "MCT");
		StudentManager studentManager = new StudentManager();
		studentManager.student1(student);
		
		Student student2 = new Student("Enes", "Arslan", "PMP");
		StudentManager studentManager2 = new StudentManager();
		studentManager.student2(student2);
		System.out.println("-----------------------------------");
		
		User user2 = new User(1, "Eray", "Kablan", "eraykablan1903@gmail.com");
		UserManager userManager2 = new UserManager();
		userManager.delete(user2);
		
		
	}

}
