package assignment;

import java.util.Scanner;

public class special_seq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[100];
		int i = 2;
		arr[0] = 2;
		arr[1] = 1;
		arr[2] = 3;
		System.out.print("2 1");
		do {
			arr[i + 1] = arr[i] + arr[i - 1] + arr[i - 2];
			System.out.print(" " + arr[i]);
			i++;
		} while (arr[i] <= n);
		sc.close();
	}
}
