package assignment;

import java.util.Scanner;

public class num_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0)
				continue;
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}

}
