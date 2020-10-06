package OOP;

import java.util.Random;

public class testmedicine {
	public static void main(String[] args) {
		medicine[] medArray = new medicine[5];
		Random rand = new Random();
		int r = rand.nextInt(3) + 1;

		medicine m;
		if (r == 1) {
			m = new tablet();
			m.displayLabel();
		} else if (r == 2) {
			m = new syrup();
			m.displayLabel();
		} else if (r == 3) {
			m = new ointment();
			m.displayLabel();
		}
	}
}
