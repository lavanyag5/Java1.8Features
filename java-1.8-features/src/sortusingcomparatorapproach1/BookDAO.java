package sortusingcomparatorapproach1;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Core Java", 500));
		books.add(new Book(6, "Spring", 120));
		books.add(new Book(3, "Pearl", 175));
		books.add(new Book(9, "Hibernate", 300));
		books.add(new Book(2, "Web Services", 200));
		return books;
	}
}
