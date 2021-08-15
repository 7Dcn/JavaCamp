package gun2odev1;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player("LeBron","James",38,38.3);
		
		Player player2 = new Player();
		player2.setFirstName("Kevin");
		player2.setLastName("Durant");
		player2.setAveragePoint(45.5);
		player2.setAge(32);
		
		PlayerService playerService = new PlayerService();
		playerService.add(player1);
		playerService.add(player2);

	}

}
