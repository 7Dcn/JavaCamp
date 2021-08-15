package gun3odev2;

public class UserService {
	
	public void add(User user) {
		System.out.println("User added to system: " + user.getFirstName());
	}
	
	public void remove(User user) {
		System.out.println("User removed from system: " + user.getFirstName());
	}

}
