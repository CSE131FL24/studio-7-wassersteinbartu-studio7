package studio7;

public class Die {
	private int sides;
	
	public Die() {
		sides = 0;
	}
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int result() {
		return (int)(Math.random()*sides+1);
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(20);
		System.out.println(d1.result());

	}

}
