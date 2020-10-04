package assignment;

import java.util.Scanner;

public class powerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 32767) {
			System.out.println("Number too large");
			System.exit(0);
		} else if (num < 0) {
			System.out.println("Number too small");
			System.exit(0);

		} else {
			// int i = 0, f = 0;
			if (num == Math.pow(2, (Math.log(num) / Math.log(2)))) {
				System.out.println("Yes");

			} else {
				System.out.println("No " + (Math.log(num) / Math.log(2)));
			}
		}
		sc.close();
	}
}
