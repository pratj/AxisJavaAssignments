package casestudy1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Book1 implements Serializable {

	public String bookId;
	public String title;
	public String author;
	public String category;
	public float price;

	public Book1(String bookId, String title, String author, String category, float price) {
		super();

		if (category.equals("Science") || category.equals("Fiction") || category.equals("Technology")
				|| category.equals("Others")) {
			this.category = category;
		} else
			System.out.println("Enter Valid Category!!");
		if (price < 0)
			System.out.println("Enter Valid Price");
		else
			this.price = price;
		if (bookId.charAt(0) == 'B' && bookId.length() == 4)
			this.bookId = bookId;
		else
			System.out.println("Enter Valid BookId");
		this.title = title;
		this.author = author;
	}
}

class BookStore1 {

	// int counter = 0;
	ArrayList<Book1> books = new ArrayList<Book1>();
	// Book[] books = new Book[10];

	public void addBook(Book1 b) {

		books.add(b);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("BookCollection.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(books);
			oos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// books[counter] = b;
		// counter++;
	}

	public void searchByTitle(String title) {
		boolean found = false;
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("BookCollection.ser"));
			ArrayList<Book1> b = (ArrayList<Book1>) ois.readObject();
			ois.close();
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i).title.equals(title)) {
					System.out.println("BookId: " + b.get(i).bookId + "\nTitle: " + b.get(i).title + "\nAuthor: "
							+ b.get(i).author + "\nCategory: " + b.get(i).category + "\nPrice: " + b.get(i).price);
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println("Book Not Found");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchByAuthor(String author) {
		boolean found = false;
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("BookCollection.ser"));
			ArrayList<Book1> b = (ArrayList<Book1>) ois.readObject();
			ois.close();
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i).author.equals(author)) {
					System.out.println("BookId: " + b.get(i).bookId + "\nTitle: " + b.get(i).title + "\nAuthor: "
							+ b.get(i).author + "\nCategory: " + b.get(i).category + "\nPrice: " + b.get(i).price);
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println("Book Not Found");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void displayAll() {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("BookCollection.ser"));
			ArrayList<Book1> b = (ArrayList<Book1>) ois.readObject();
			ois.close();
			for (int i = 0; i < b.size(); i++) {
				System.out.println("Book" + (i + 1) + ":");
				System.out.println("BookId: " + b.get(i).bookId + "\nTitle: " + b.get(i).title + "\nAuthor: "
						+ b.get(i).author + "\nCategory: " + b.get(i).category + "\nPrice: " + b.get(i).price);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void displayBook(String bookId) {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("BookCollection.ser"));
			@SuppressWarnings("unchecked")
			ArrayList<Book1> b = (ArrayList<Book1>) ois.readObject();
			ois.close();
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i).bookId.equals(bookId)) {
					System.out.println("BookId: " + b.get(i).bookId + "\nTitle: " + b.get(i).title + "\nAuthor: "
							+ b.get(i).author + "\nCategory: " + b.get(i).category + "\nPrice: " + b.get(i).price);
					break;
				}
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public void updateBook(String bookId) {

		int posFind = 0;
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("BookCollection.ser"));
			ArrayList<Book1> b = (ArrayList<Book1>) ois.readObject();
			ois.close();
			for (int i = 0; i < b.size(); i++) {
				if (b.get(i).bookId.equals(bookId))
					posFind = i;
			}
			Scanner sc = new Scanner(System.in);
			int updation = 0;
			while (updation != 5) {

				System.out.println("Enter The Updations: ");
				System.out.println("Press: 1: Enter new Title \n2: Enter new Author"
						+ "\n3: Enter new Category\n4: Enter new Price\n5: Exit the updation");
				updation = sc.nextInt();
				switch (updation) {
				case 1:
					System.out.println("Enter The New Title: ");
					sc.nextLine();
					String newTitle = sc.nextLine();
					Book1 bNew = new Book1(b.get(posFind).bookId, newTitle, b.get(posFind).author,
							b.get(posFind).category, b.get(posFind).price);
					b.set(posFind, bNew);
					break;
				case 2:
					System.out.println("Enter The New Author: ");
					sc.nextLine();
					String newAuthor = sc.nextLine();
					Book1 bAuth = new Book1(b.get(posFind).bookId, b.get(posFind).title, newAuthor,
							b.get(posFind).category, b.get(posFind).price);
					b.set(posFind, bAuth);
					break;
				case 3:
					System.out.println("Enter The New Category: ");
					sc.nextLine();
					String newCategory = sc.nextLine();
					Book1 bCat = new Book1(b.get(posFind).bookId, b.get(posFind).title, b.get(posFind).author,
							newCategory, b.get(posFind).price);
					b.set(posFind, bCat);
					break;
				case 4:
					System.out.println("Enter The New Price: ");
					float newPrice = sc.nextInt();
					Book1 bPri = new Book1(b.get(posFind).bookId, b.get(posFind).title, b.get(posFind).author,
							b.get(posFind).category, newPrice);
					b.set(posFind, bPri);

					break;
				case 5:
					System.out.println("Exiting, Thanks for Updation!!");
					break;
				default:
					System.out.println("Press Valid Key!");

				}
				FileOutputStream fos = new FileOutputStream("BookCollection.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(b);
				oos.close();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}

public class BookUtilSerializable {

	public static void main(String[] args) {

		BookStore1 bs = new BookStore1();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\n1: Add A Book to the collection" + "\n2: Search By Title" + "\n3: Search By Author"
					+ "\n4: Display All Books Available" + "\n5: Display Book by BookID" + "\n6: Update A Book"
					+ "\n7: Exit");
			System.out.print("Enter choice:");
			int operation = sc.nextInt();
			sc.nextLine();
			switch (operation) {
			case 1:
				System.out.println("Enter the BookId of the book: ");
				String bookId = sc.nextLine();
				System.out.println("Enter Title of the book: ");
				String title = sc.nextLine();
				System.out.println("Enter the Author of the book: ");
				String author = sc.nextLine();
				System.out.println("Enter the Category of the book: ");
				String category = sc.nextLine();
				System.out.println("Enter the Price of the book: ");
				float price = sc.nextFloat();
				Book1 b = new Book1(bookId, title, author, category, price);
				if (!(b.category == null || b.price == 0.0 || b.bookId == null))
					bs.addBook(b);
				else
					System.out.println("Please Enter correct Input to add a book");
				break;
			case 2:
				System.out.println("Enter the title of the book To Search ");
				String titleSearch = sc.nextLine();
				bs.searchByTitle(titleSearch);
				break;
			case 3:
				System.out.println("Enter the author of the book To Search ");
				String authorSearch = sc.nextLine();
				bs.searchByAuthor(authorSearch);
				break;
			case 4:
				bs.displayAll();
				break;
			case 5:
				System.out.println("Enter the BookID of the book To Search ");
				String bookIdSearch = sc.nextLine();
				bs.displayBook(bookIdSearch);
				break;
			case 6:
				System.out.println("Enter the BookId of the book To Update ");
				String bookIdUpdate = sc.nextLine();
				bs.updateBook(bookIdUpdate);
				break;
			case 7:
				System.out.println("Goodbye!!..");
				System.exit(0);
			default:
				System.out.println("Enter a Valid Key");
			}
		}

	}

}
