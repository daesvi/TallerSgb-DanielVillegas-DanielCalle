import Interface.Librarian;
import model.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Satanas", "Mario Mendoza", "2019");
        library.addBook("Lucifer", "Daniel Villegas", "2021");
        library.addBook("Jesus", "Daniel Calle", "2020");

        // catalog shown
        library.showCatalogOfBooksAvailable();

        // users are added
        library.addUser("Daniel");
        library.addUser("Sebastian");

        // books are lent
        library.lendBook("Jesus", "Daniel");
        library.lendBook("Satanas", "Sebastian");
        library.lendBook("Lucifer", "Daniel");

        // catalog shown
        library.showCatalogOfBooksAvailable();

        // borrowed book is returned
        library.returnBook("Jesus");


        // catalog shown
        library.showCatalogOfBooksAvailable();
    }
}