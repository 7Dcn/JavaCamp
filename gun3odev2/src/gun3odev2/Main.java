package gun3odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setAge(30);
		instructor1.setLecture("Java");
		
		InstructorService instructorService = new InstructorService();
		instructorService.add(instructor1);
		instructorService.remove(instructor1);
		instructorService.lecture(instructor1);
		
		Student student1 = new Student();
		student1.setFirstName("Doðancan");
		student1.setLastName("Nurlu");
		student1.setAge(27);
		student1.setGrade(97.7);
		
		StudentService studentService = new StudentService();
		studentService.add(student1);
		studentService.remove(student1);
		studentService.gradeAdd(student1);

	}

}
