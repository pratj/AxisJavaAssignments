package assignment;

import java.util.Scanner;

public class vehicleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int l = Integer.toString(num).length();
		int l1 = Integer.toString(num).length();
		if (l != 4 && l1 != 4) {
			System.out.println("Invalid");
			System.exit(0);
		}
		int t;
		for (int i = num; i < num1; i++) {
			int temp = i, sum = 0;
			while (temp > 0) {
				t = temp % 10;
				sum += t;
				temp = temp / 10;
			}
			if (sum == 9) {
				System.out.println(i /* + "\t" + sum */);
			}
		}
		sc.close();
	}
}
