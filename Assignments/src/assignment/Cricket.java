package assignment;

import java.util.Scanner;

public class Cricket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int overs, t_score;
		double c_rr, r_rr;

		System.out.println("Enter the numbers of overs bowled so far");
		overs = sc.nextInt(); // Integer.parseInt(sc.nextLine());
		System.out.println("Enter the current run rate");
		c_rr = sc.nextDouble();
		System.out.println("Enter the target score");
		t_score = sc.nextInt(); // Integer.parseInt(sc.nextLine());

		r_rr = (t_score - (c_rr * overs)) / (50 - overs);
		System.out.println("The required run rate is " + String.format("%.2f", r_rr));
		sc.close();
	}
}
