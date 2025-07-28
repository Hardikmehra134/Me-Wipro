package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookStore {
    private int bookId;
    private String bookName;

    public BookStore(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName);
    }
}

class BookNameComparator implements Comparator<BookStore> {
    @Override
    public int compare(BookStore b1, BookStore b2) {
        return b1.getBookName().compareToIgnoreCase(b2.getBookName());
    }
}

class BookIdComparator implements Comparator<BookStore> {
    @Override
    public int compare(BookStore b1, BookStore b2) {
        return Integer.compare(b1.getBookId(), b2.getBookId());
    }
}

public class Problem41 {

	public static void main(String[] args) {
		 List<BookStore> books = new ArrayList<>();
	        books.add(new BookStore(102, "DS"));
	        books.add(new BookStore(101, "AI"));
	        books.add(new BookStore(104, "ML"));
	        books.add(new BookStore(103, "Java"));

	        Collections.sort(books, new BookNameComparator());
	        System.out.println("Sorted by Book Name:\n");
	        for (BookStore b : books) {
	            b.display();
	        }

	        Collections.sort(books, new BookIdComparator());
	        System.out.println("\nSorted by Book ID:\n");
	        for (BookStore b : books) {
	            b.display();
	    }
	}
}

/*
Sorted by Book Name:

Book ID: 101, Book Name: AI
Book ID: 102, Book Name: DS
Book ID: 103, Book Name: Java
Book ID: 104, Book Name: ML

Sorted by Book ID:

Book ID: 101, Book Name: AI
Book ID: 102, Book Name: DS
Book ID: 103, Book Name: Java
Book ID: 104, Book Name: ML
*/