package assignment;

import java.util.Scanner;

public class productOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Invalid");
			System.exit(0);
		}
		int prod = 1;
		int temp;
		while (num > 0) {
			temp = num % 10;
			prod *= temp;
			// System.out.println(num + " " + prod);
			num = num / 10;
		}
		System.out.println(prod);
		sc.close();
	}
}
