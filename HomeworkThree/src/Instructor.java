
public class Instructor {
	String firstName;
	String lastName;
	String course;
	String course2;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName, String course, String course2) {
		super();;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.course2 = course2;
	}


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse2() {
		return course2;
	}

	public void setCourse2(String course) {
		this.course2 = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



}
