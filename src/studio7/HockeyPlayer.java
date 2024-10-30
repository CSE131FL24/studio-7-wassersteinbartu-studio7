package studio7;

public class HockeyPlayer {
	private String name;
	private int jersey;
	private boolean hand;
	private boolean left;
	private boolean right;
	
	public HockeyPlayer() {
		name = "";
		jersey = 0;
		hand = true;
		left = true;
		right = true;
	}
	
	public HockeyPlayer(String name, int jersey, boolean hand, boolean left, boolean right) {
		this.name = name;
		this.jersey = jersey;
		this.hand = hand;
		this.left = left;
		this.right = right;
	}
	
	public int games() {
		
	}
	
	public static void main(String[] args) {
		HockeyPlayer h1 = new HockeyPlayer("John", 99, true, true, true);

	}

}
