public class Main {
    public static void main(String[] args) {
        Book misery = new Book("Misery",1987);
        System.out.println("misery.name = " + misery.getName());
        System.out.println("misery.publicationYear = " + misery.getPublicationYear());
        misery.setPublicationYear(1986);
        System.out.println("misery.getPublicationYear() = " + misery.getPublicationYear());
        Author author = new Author ("Stephen", "King");
        System.out.println("author.firstNameAuthor = " + author.getFirstNameAuthor());
        System.out.println("author.lastNameAuthor = " + author.getLastNameAuthor());

        System.out.println(" ");

        Book theBlackCat = new Book("The Black Cat", 1843);
        System.out.println("theBlackCat.getName() = " + theBlackCat.getName());
        System.out.println("theBlackCat.getPublicationYear() = " + theBlackCat.getPublicationYear());
        Author edgarPoe = new Author("Edgar", "Poe");
        System.out.println("edgarPoe.getFirstNameAuthor() = " + edgarPoe.getFirstNameAuthor());
        System.out.println("edgarPoe.getLastNameAuthor() = " + edgarPoe.getLastNameAuthor());


    }
}