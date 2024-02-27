package model;

import Interface.Librarian;
import Interface.User;

import java.util.ArrayList;
import java.util.List;

public class Library implements User, Librarian {
    // Attribute
    private String name;

    private List<Book> catalogOfBooks = new ArrayList<>();

    // Constructor
    public Library(String name) {
        this.name = name;
    }
    public Library() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods

    @Override
    public void addUser(String nameUser) {
        new model.User(nameUser);
        System.out.println("\nUsuario creado con éxito");
    }

    @Override
    public void showCatalogOfBooksAvailable() {
        boolean anyBookAvailable = false;
        for (Book book : catalogOfBooks){
            if (book.isAvailable() == true){
                System.out.println("\nTítulo: " + book.getTitle() + ", Autor: " + book.getAuthor() + ", Año de publicación: " + book.getPublicationYear());
                anyBookAvailable = true;
            }
        }
        if (anyBookAvailable == false){
            System.out.println("\nNo hay ningún libro disponible");
        }
    }

    @Override
    public void addBook(String title, String author, String publicationYear) {
        catalogOfBooks.add(new Book(title, author, publicationYear));

        System.out.println("\nLibro agregado con éxito");
    }

    @Override
    public void lendBook(String nameBook, String namePerson) {
        for (Book book : catalogOfBooks){
            if (book.getTitle().equals(nameBook)){
                if (book.isAvailable()){
                    book.setAvailable(false);
                    System.out.println("\nEl libro " + nameBook + " ha sido prestado a " + namePerson);
                }else {
                    System.out.println("\nEl libro " + nameBook + " no está disponible");
                }
            }
        }
    }

    @Override
    public void returnBook(String nameBook) {
        for (Book book : catalogOfBooks){
            if (book.getTitle().equals(nameBook)){
                if (!book.isAvailable()){
                    book.setAvailable(true);
                    System.out.println("\nEl libro " + nameBook + " ha sido devuelto a la biblioteca");
                }
            }
        }
    }
}
