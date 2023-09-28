package seminar6.Task1;

public class BookGenre implements Genre{
    private String genreOfBook;

    public BookGenre(String genreOfBook) {
        this.genreOfBook = genreOfBook;
    }

    @Override
    public String takeGenre() {
        return this.genreOfBook;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "genreOfBook='" + genreOfBook + '\'' +
                '}';
    }
}
