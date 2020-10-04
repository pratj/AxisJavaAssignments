package assignment;

import java.util.Scanner;

public class maximumSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Invalid");
			System.exit(0);
		}
		int[] numbers = new int[num];
		for (int i = 0; i < num; i++) {
			numbers[i] = sc.nextInt();
		}
		int max = maximumSum(numbers, num);
		System.out.println(max);
		sc.close();
	}

	public static int maximumSum(int[] numbers, int num) {
		int esum = 0, osum = 0;
		for (int i : numbers) {
			if (i % 2 == 0)
				esum += i;
			else
				osum += i;
		}
		if (esum > osum)
			return esum;
		else
			return osum;
	}
}
