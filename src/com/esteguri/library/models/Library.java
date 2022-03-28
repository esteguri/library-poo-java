package com.esteguri.library.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(String id) {
        books = books.stream().filter(book -> !id.equalsIgnoreCase(book.getId())).collect(Collectors.toList());
    }

    public List<Book> findBooksByName(String q) {
        return books.stream()
                .filter(book ->  book.getName().toLowerCase().contains(q.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByAuhor(String q) {
        return books.stream()
                .filter(book -> {
                    return book.getAuthors()
                            .stream()
                            .anyMatch(author -> author.getName().toLowerCase().contains(q.toLowerCase()));
                })
                .collect(Collectors.toList());
    }

    public int getStock() {
        int total = 0;
        for(Book book:this.books){
            total += book.getStock();
        }
        return total;
    }

    public double getPriceTotal(){
        double total = 0.0;
        for(Book book:this.books){
            total += book.getPriceTotal();
        }
        return total;
    }
}