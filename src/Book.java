public class Book {
    private String name;
    private int publicationYear;
    private String firstNameAuthor;
    private String lastNameAuthor;
    public Book (String name, int publicationYear, String firstNameAuthor, String lastNameAuthor) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.firstNameAuthor = firstNameAuthor;
        this.lastNameAuthor = lastNameAuthor;
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
    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }
    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }
}
