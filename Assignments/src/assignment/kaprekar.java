package assignment;

import java.util.Scanner;

public class kaprekar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = n;
		n = (int) Math.pow(n, 2);
		// System.out.println(n);
		double digit = Integer.toString(n).length();
		double k = n % Math.pow(10, Math.ceil(digit / 2));
		double t = Math.floor(n / Math.pow(10, Math.ceil(digit / 2)));

		if ((int) k + t == l)
			System.out.println("Kaprekar");
		else
			System.out.println("Not");
		sc.close();
	}
}
