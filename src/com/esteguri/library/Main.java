package com.esteguri.library;

import com.esteguri.library.enums.Gender;
import com.esteguri.library.models.Author;
import com.esteguri.library.models.Book;
import com.esteguri.library.models.Library;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // Authors
        Author authorStephen = new Author("Stephen King", "sking@gmail.com", Gender.MALE);
        Author authorEsteban = new Author("Esteban", "egutierrez@gmail.com", Gender.MALE);
        Author authorShonda = new Author("Shonda", "shonda@gmail.com", Gender.FEMALE);

        // Books
        Book bookIt = new Book("It", 20.0,2, Arrays.asList(authorStephen, authorEsteban));
        Book bookGreysAnatomy = new Book("Greys Anatomy", 24.0,10, Arrays.asList(authorShonda, authorEsteban));

        // Library
        Library lasVegasLibrary = new Library("Las Vegas Library");

        // Add books to Library
        lasVegasLibrary.addBook(bookIt);
        lasVegasLibrary.addBook(bookGreysAnatomy);
        // lasVegasLibrary.removeBookById(bookGreysAnatomy.getId());

        System.out.println("Stock: " + lasVegasLibrary.getStock());
        System.out.println("Precio Total: " + lasVegasLibrary.getPriceTotal());


        // Find book by name q = Ana
        List<Book> resultFindByName = lasVegasLibrary.findBooksByName("Ana");
        System.out.println("FIND BY BOOK NAME:");
        resultFindByName.stream().forEach(book -> System.out.println(book.getName()));

        // Find book by autor q = Esteban
        List<Book> resultFindByAuhor = lasVegasLibrary.findBooksByAuhor("Esteban");
        System.out.println("FIND BY AUTHOR:");
        resultFindByAuhor.stream().forEach(book -> System.out.println(book.getName()));


    }
}
