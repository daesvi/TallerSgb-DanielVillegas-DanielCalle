package Interface;

import model.Book;

public interface Librarian {
    void addUser(String nameUser);
    void showCatalogOfBooksAvailable();
    void addBook(String title, String author, String publicationYear);
}
