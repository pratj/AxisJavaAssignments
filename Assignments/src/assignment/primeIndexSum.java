package assignment;

import java.util.Scanner;

public class primeIndexSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int avg = 0, cnt = 0;
		int[] arr = new int[n];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			if (checkprime(i) && i != 1) {
				System.out.println(" " + (i) + " " + arr[i]);
				avg += arr[i];
				cnt++;
			} else
				continue;
		}

		System.out.println(avg / cnt);
	}

	public static boolean checkprime(int i) {
		int rem;
		for (int j = 2; j <= i / 2; j++) {
			rem = i % j;
			if (rem == 0) {
				return false;

			}
		}
		return true;
	}
}
