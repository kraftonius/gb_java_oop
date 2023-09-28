package seminar6.Task1;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable{

    private List<Book> books = new ArrayList<>();;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public Book findByAuthor(String author) {
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                return book;
            }
        }
        return null;
    }
}
