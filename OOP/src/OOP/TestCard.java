package OOP;

import java.util.Scanner;

public class TestCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TravelCard tc = new TravelCard();
		// PrepaidCard pc = new PrepaidCard();
		System.out.println("Enter the amount to add in Avail Bal");
		double availBal = sc.nextDouble();
		PrepaidCard.rechargeCard(availBal);
		System.out.println("Enter th amount to be swiped!");
		double amount = sc.nextDouble();
		if (tc.swipeCard(amount))
			System.out.println();

	}

}
