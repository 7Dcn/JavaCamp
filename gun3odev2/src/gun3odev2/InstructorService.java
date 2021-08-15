package gun3odev2;

public class InstructorService extends UserService {
	
	public void lecture(Instructor instructor) {
		System.out.println("Given lectures: " + instructor.getLecture());
	}

}
