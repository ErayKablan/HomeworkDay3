public class Student {
	String studentName;
	String studentLastName;
	String Certificates;
	
	public Student() {
		
	}
	
	public Student(String studentName, String studentLastName, String Certificates) {
		super();
		this.studentName = studentName;
		this.studentLastName = studentLastName;
		this.Certificates = Certificates;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getCertificates() {
		return Certificates;
	}

	public void setCertificates(String certificates) {
		Certificates = certificates;
	}



}