package gun3odev2;

public class Instructor extends User {
	
	private String lecture;
	
	public Instructor() {}

	public Instructor(String firstName, String lastName, int age, String lecture) {
		super(firstName, lastName, age);
		this.lecture = lecture;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

}
