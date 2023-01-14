public class Main {
    public static void main(String[] args) {
        Book misery = new Book("Misery",1987, "Stephen", "King");
        System.out.println("misery.name = " + misery.getName());
        System.out.println("misery.publicationYear = " + misery.getPublicationYear());
        misery.setPublicationYear(1986);
        System.out.println("misery.getPublicationYear() = " + misery.getPublicationYear());
        System.out.println("misery.firstNameAuthor = " + misery.getFirstNameAuthor());
        System.out.println("misery.lastNameAuthor = " + misery.getLastNameAuthor());

        System.out.println(" ");

        Book theBlackCat = new Book("The Black Cat", 1843, "Edgar", "Poe");
        System.out.println("theBlackCat.getName() = " + theBlackCat.getName());
        System.out.println("theBlackCat.getPublicationYear() = " + theBlackCat.getPublicationYear());
        System.out.println("theBlackCat.getFirstNameAuthor() = " + theBlackCat.getFirstNameAuthor());
        System.out.println("theBlackCat.getLastNameAuthor() = " + theBlackCat.getLastNameAuthor());
    }
}