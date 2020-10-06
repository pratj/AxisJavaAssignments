package OOP;

import java.util.Scanner;

public class bookDetails {

	public static void main(String[] args) {
		book bk = new book();
		engineeringBook ebk = new engineeringBook();
		Scanner sc = new Scanner(System.in);

		bk.setBookNo(sc.nextInt());
		bk.setTitle(sc.nextLine());
		bk.setAuthor(sc.nextLine());
		bk.setPrice(sc.nextFloat());
		ebk.setCategory("Phyysics");
	}

}
