package casestudy1;

import java.util.Scanner;

public class bookUtil {

	public static void main(String[] args) {

		BookStore bs = new BookStore();
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\n\n1: Add A Book to the collection" + "\n2: Search By Title" + "\n3: Search By Author"
					+ "\n4: Display All Books Available" + "\n5: Display Book by BookID" + "\n6: Update A Book"
					+ "\n7: Exit");
			System.out.print("Enter choice:");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				System.out.println("Enter BookId: ");
				String bookId = sc.nextLine();
				System.out.println("Enter Title: ");
				String title = sc.nextLine();
				System.out.println("Enter Author: ");
				String author = sc.nextLine();
				System.out.println("Enter Category: ");
				String category = sc.nextLine();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				Book b = new Book(bookId, title, author, category, price);
				if (!(b.category == null || b.price <= 0.0 || b.bookId == null))
					bs.addBook(b);
				else
					System.out.println("Please Try Again!");
				break;
			case 2:
				System.out.println("The Title of The Book To be Searched: ");
				String titleSearch = sc.nextLine();
				bs.searchByTitle(titleSearch);
				break;
			case 3:
				System.out.println("Author Name To be Searched: ");
				String authorSearch = sc.nextLine();
				bs.searchByAuthor(authorSearch);
				break;
			case 4:
				bs.displayAll();
				break;
			case 5:
				System.out.println("Enter The bookId To be Searched: ");
				String bookIdSearch = sc.nextLine();
				bs.displayBook(bookIdSearch);
				break;
			case 6:
				System.out.println("Enter The bookId To be Updated: ");
				String bookIdUpdate = sc.nextLine();
				bs.updateBook(bookIdUpdate);
				break;
			case 7:
				System.out.println("Goodbye!");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Enter the Valid Choice: ");
			}
		} while (true);

	}
}
