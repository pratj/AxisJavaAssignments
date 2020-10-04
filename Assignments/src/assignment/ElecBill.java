package assignment;

import java.util.Scanner;

public class ElecBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pr, cr, dr;
		double bill, f30r = 2.3, s70r = 3.5, t100r = 4.6;

		System.out.println("Enter the previous reading");
		pr = sc.nextInt(); // Integer.parseInt(sc.nextLine());
		System.out.println("Enter the current reading");
		cr = sc.nextInt();

		dr = cr - pr;
		bill = (30 % dr) * f30r + (70 % (dr = dr - 30)) * s70r + (dr = dr - 70) * t100r;
		System.out.println("The bill is " + String.format("%.2f", bill));
		sc.close();
	}
}
