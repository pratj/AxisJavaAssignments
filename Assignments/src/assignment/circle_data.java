package assignment;

import java.util.Scanner;

public class circle_data {
	private static final double PI = 3.14;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rad;
		String or;

		System.out.println("Enter the Radius");
		rad = Integer.parseInt(sc.nextLine()); // Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Output required");
		or = sc.nextLine().toLowerCase();

		double result = 0;
		switch (or) {
		case "dia":
			result = 2 * rad;
			System.out.println("The diameter of the circle is " + String.format("%.2f", result));
			break;
		case "ar":
			result = 2 * PI * Math.pow(rad, 2);
			System.out.println("The area of the circle is " + String.format("%.2f", result));
			break;
		case "per":
			result = 2 * PI * rad;
			System.out.println("The perimeter of the circle is " + String.format("%.2f", result));
			break;
		case "arsem":
			result = PI * rad;
			System.out.println("The area of semi circle is " + String.format("%.2f", result));
			break;
		default:
			System.out.println("Invalid Entry");
			System.exit(0);
		}

		sc.close();
	}
}
