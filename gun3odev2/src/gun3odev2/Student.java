package gun3odev2;

public class Student extends User {

	private double grade;

	public Student() {	}

	public Student(String firstName, String lastName, int age, double grade) {
		super(firstName, lastName, age);
		this.grade = grade;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
