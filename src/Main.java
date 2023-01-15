public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Book misery = new Book(stephenKing, "Misery", 1987);
        System.out.println("misery.getAuthor() = " + misery.getAuthor());
        System.out.println("misery.name = " + misery.getName());
        System.out.println("misery.publicationYear = " + misery.getPublicationYear());
        misery.setPublicationYear(1986);
        System.out.println("misery.getPublicationYear() = " + misery.getPublicationYear());


        System.out.println(" ");
        Author edgarPoe = new Author("Edgar", "Poe");
        Book theBlackCat = new Book(edgarPoe, "The Black Cat", 1843);
        System.out.println("theBlackCat.getAuthor() = " + theBlackCat.getAuthor());
        System.out.println("theBlackCat.getName() = " + theBlackCat.getName());
        System.out.println("theBlackCat.getPublicationYear() = " + theBlackCat.getPublicationYear());

    }
}