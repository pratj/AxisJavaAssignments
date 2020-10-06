package casestudy1;

import java.util.regex.Pattern;

class Book {

	public String bookId;
	public String title;
	public String author;
	public String category;
	public float price;

	public Book(String bookId, String title, String author, String category, float price) {
		super();

		if (category.equalsIgnoreCase("Science") || category.equalsIgnoreCase("Fiction")
				|| category.equalsIgnoreCase("Technology") || category.equals("Others")) {
			this.category = category;
		} else
			System.out.println("Enter Valid Category!");
		if (price < 0)
			System.out.println("Enter Valid Price");
		else
			this.price = price;
		if (Pattern.matches("[B]...", bookId))
			this.bookId = bookId;
		else
			System.out.println("Valid BookId should start with B followed by 3 char values");
		this.title = title;
		this.author = author;
	}
}