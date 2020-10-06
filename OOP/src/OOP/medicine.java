package OOP;

public abstract class medicine {
	private double price;
	private String exp;

	public void getDetails() {
		System.out.println(price + " " + exp);
	}

	public abstract void displayLabel();
}
