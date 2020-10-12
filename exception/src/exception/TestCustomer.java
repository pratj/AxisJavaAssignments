package exception;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) throws InvalidInputException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer number");
		String cno = sc.nextLine();
		System.out.println("Enter the customer Name");
		String cname = sc.nextLine();
		System.out.println("Enter the customer Category");
		String cat = sc.nextLine();
		try {
			Customer cus = new Customer(cno, cname, cat);
			System.out.println("Customer Number: " + cus.getCustNo() + " Customer Name: " + cus.getCustName()
					+ " Category: " + cus.getCategory());
			;
		} catch (InvalidInputException iie) {
			System.out.println("Enter the Correct Details");
		}
		sc.close();

	}

}
