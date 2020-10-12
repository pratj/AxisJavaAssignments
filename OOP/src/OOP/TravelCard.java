package OOP;

public class TravelCard extends PrepaidCard implements Rewardable {
	int rewardPoints;

	boolean swipeCard(double amount) {

		if (amount > swipeLimit && amount > availableBalance)
			return false;
		else {
			amount *= 60;
			availableBalance *= 60;
			amount += 0.05 * amount;
			availableBalance -= amount;
			System.out.println(availableBalance);
			return true;

		}

	}

	public int calReward(double amount) {
		int i = (int) amount / 100;
		while (i > 0) {
			rewardPoints += 5;
			i--;
		}
		return rewardPoints;
	}
}
