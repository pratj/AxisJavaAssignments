package assignment;

import java.util.Scanner;

public class ElementCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > 0)
				continue;
			else {
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		int s = sc.nextInt();

		int res = findElementCount(arr, n, s);
		System.out.println(res);

		sc.close();
	}

	public static int findElementCount(int[] arr, int n, int s) {
		int index = -1;
		for (int i : arr) {
			if (s == i) {
				index = i;
				break;
			}

		}
		return index;

	}
}
