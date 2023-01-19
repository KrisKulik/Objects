import java.util.Objects;

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

    /*Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
    Обратите внимание, что toString книги не должен дублировать код из toString автора,
    а должен делегировать (вызывать) его версию метода.*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
