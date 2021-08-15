package gun3odev2;

public class StudentService extends UserService {
	
	public void gradeAdd(Student student) {
		System.out.println("Öðrencinin notu sisteme eklendi: " + student.getGrade());
	}

}
