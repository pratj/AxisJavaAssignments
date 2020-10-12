package OOP;

public abstract class PrepaidCard {
	int CardNo;
	static double availableBalance;
	double swipeLimit;

	abstract boolean swipeCard(double amount);

	@Override
	public String toString() {
		return "Card Number " + CardNo + "\nAvailable Balance " + availableBalance + "\nSwipe Limit " + swipeLimit;
	}

	static void rechargeCard(double amount) {
		availableBalance += amount;
	}
}
