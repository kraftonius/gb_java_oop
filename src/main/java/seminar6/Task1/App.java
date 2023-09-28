package seminar6.Task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>();
        Book book1 = new Book("Elves on War", "Robert Appleton", new BookGenre("Fantasy"));
        Book book2 = new Book("Murder in the Garden", "William Hawk", new BookGenre("Detective"));
        Book book3 = new Book("Crusaders of Richard the Lionheart", "Samuel Smith", new BookGenre("History"));
        Book book4 = new Book("Space Bear", "Lindsey Rose", new BookGenre("Science fiction"));
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        Library library = new Library(booksList);
        Book williamHawk = library.findByAuthor("William Hawk");
        System.out.println(williamHawk);
        Formatter formatter = new JSONFormatter();


    }

}
