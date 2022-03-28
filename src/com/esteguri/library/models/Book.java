package com.esteguri.library.models;

import java.util.List;
import java.util.UUID;

public class Book {

    private final String id = UUID.randomUUID().toString();
    private String name;
    private double price;
    private int stock;
    private List<Author> authors;

    public Book(String name, double price, int stock, List<Author> authors) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public double getPriceTotal() {
        return this.price * this.stock;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
