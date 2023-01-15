public class Book {
    private final Author author;
    private final String name;
    private int publicationYear;


    public Book (Author author, String name, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;

    }
    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
