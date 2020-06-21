

import java.util.Random;

public class RollingDice {
	public static void main(String[] args) {
		
		Random randNum = new Random();
		int a = randNum.nextInt(6) + 1;
		
		System.out.println("Your rolled a: " + a);
	}
}
