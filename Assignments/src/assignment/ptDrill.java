package assignment;

import java.util.Scanner;

public class ptDrill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (!(Math.sqrt(n) % 1 == 0 && Math.sqrt(n) % 2 != 0f)) {
			System.out.println("Enter square of odd number!");
			System.exit(0);
		}

		String[][] stu = new String[(int) Math.sqrt(n)][(int) Math.sqrt(n)];
		int line = (int) Math.sqrt(n);
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				stu[i][j] = sc.nextLine();
			}
		}
	}
}
