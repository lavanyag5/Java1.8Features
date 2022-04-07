package sortusingcomparatorapproach1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksInSort() {
		
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, new MyComparatorId());
		return books;

	}

	public static void main(String[] args) {

		BookService service = new BookService();
		System.out.println(service.getBooksInSort());

	}

}

// Sort based on names using Comparator traditional approach
class MycomparatorNames implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {

		// Ascending order sorting of Names
		return o1.getName().compareTo(o2.getName());

		// Descending order sorting of Names
		// return o2.getName().compareTo(o1.getName());
	}

}

class MyComparatorPages implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {

		// Ascending order sorting of Pages
		return o1.getPages() - o2.getPages();

		// Descending order sorting of pages
		// return o2.getPages() - o1.getPages();
	}
}

class MyComparatorId implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		// Ascending order sorting of Id
		return o1.getId() - o2.getId();

		// Descending order sorting of Id
		// return o2.getId() - o1.getId();
	}
}