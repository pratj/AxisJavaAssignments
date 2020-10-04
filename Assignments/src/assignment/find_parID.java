package assignment;

import java.util.Scanner;

public class find_parID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of participants");
		int n = sc.nextInt();
		System.out.println("Enter the IDs");
		int[] id = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = sc.nextInt();
		}
		System.out.println("Enter ID to search");
		int sid = sc.nextInt();
		int f = 0;
		if (sid == 0)
			System.exit(0);
		else {
			for (int i : id) {
				if (sid == i) {
					System.out.println("ID exists");
					System.exit(0);
				} else {
					f = 1;
				}
			}
			System.out.println("ID not exists");
		}
	}
}
