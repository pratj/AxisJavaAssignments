package casestudy1;

import java.util.Scanner;

class BookStore {

	int counter = 0;
	Book[] books = new Book[10];

	public void addBook(Book b) {
		books[counter] = b;
		counter++;
	}

	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < counter; i++) {
			if (books[i].title.equals(title)) {
				System.out.println("BookId: " + books[i].bookId + "\nTitle: " + books[i].title + "\nAuthor: "
						+ books[i].author + "\nCategory: " + books[i].category + "\nPrice: " + books[i].price);
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("Book Not Found");
	}

	public void searchByAuthor(String author) {
		boolean found = false;
		for (int i = 0; i < counter; i++) {
			if (books[i].author.equals(author)) {
				System.out.println("BookId: " + books[i].bookId + "\nTitle: " + books[i].title + "\nAuthor: "
						+ books[i].author + "\nCategory: " + books[i].category + "\nPrice: " + books[i].price);
				break;
			}
		}
		if (!found)
			System.out.println("Book Not Found");
	}

	public void displayAll() {
		for (int i = 0; i < counter; i++) {
			System.out.println("...............................Book" + (i + 1) + "..........................");
			System.out.println("BookId: " + books[i].bookId + "\nTitle: " + books[i].title + "\nAuthor: "
					+ books[i].author + "\nCategory: " + books[i].category + "\nPrice: " + books[i].price);
		}
	}

	public void displayBook(String bookId) {
		for (int i = 0; i < counter; i++) {
			if (books[i].bookId.equals(bookId)) {
				System.out.println("...............................Book" + (i + 1) + "..........................");
				System.out.println("BookId: " + books[i].bookId + "\nTitle: " + books[i].title + "\nAuthor: "
						+ books[i].author + "\nCategory: " + books[i].category + "\nPrice: " + books[i].price);
				break;
			}
		}
	}

	public void updateBook(String bookId) {

		int posFind = 0;
		for (int i = 0; i < counter; i++) {
			if (books[i].bookId.equals(bookId))
				posFind = i;
		}
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while (input != 5) {

			System.out.println("\n1: Title Update" + "\n2: Author" + "\n3: Category" + "\n4: Price" + "\n5: Exit");
			System.out.print("Enter choice:");
			input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.print("Enter The New Title: ");
				sc.nextLine();

				books[posFind].title = sc.nextLine();
				System.out.println();
				break;
			case 2:
				System.out.print("Enter The New Author: ");
				sc.nextLine();

				books[posFind].author = sc.nextLine();
				System.out.println();
				break;
			case 3:
				System.out.print("Enter The New Category: ");
				sc.nextLine();

				books[posFind].category = sc.nextLine();
				System.out.println();
				break;
			case 4:
				System.out.print("Enter The New Price: ");
				books[posFind].price = sc.nextInt();
				System.out.println();
				break;
			case 5:
				System.out.println("Exiting, Thanks for Updation!!");
				break;
			default:
				System.out.println("Press Valid Key!");
			}
		}
	}

}