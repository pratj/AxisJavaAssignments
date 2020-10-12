package exception;

import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculator1 {

	public static void main(String[] args) throws DateException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB");
		String date = sc.nextLine();

		AgeCalculator1 a = new AgeCalculator1();
		try {
			int age = a.calculateAge(date);
			System.out.println(age);
		} catch (ParseException e) {
			System.out.println("Date of Birth should be in dd/mm/yyyy format");
		}

	}

}
