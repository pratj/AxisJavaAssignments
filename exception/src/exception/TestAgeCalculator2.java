package exception;

import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculator2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB");
		String date = sc.nextLine();

		AgeCalculator2 a = new AgeCalculator2();
		try {
			int age = a.calculateAge(date);
			System.out.println(age);
		} catch (ParseException e) {
			System.out.println("Date of Birth should be in dd/mm/yyyy format");
		} catch (InvalidDOBException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
