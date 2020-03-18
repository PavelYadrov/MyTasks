package com.task4.pavelyadrov;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +"name= " + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + '}';
    }

    public String getAuthorsName(){
        StringBuilder names = new StringBuilder();
        String name;
        for (Author author:authors) {
            name=author.getName();
            names.append(name);
            names.append(", ");
        }
        return names.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (qty != book.qty) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (authors.length!=book.authors.length) return false;
        int count=0;
        for (Author author : authors) {
            for (Author author1:book.authors) {
                if (author.equals(author1)) {
                    count++;
                    break;
                }
            }
        }
        return count==authors.length;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(authors);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + qty;
        return result;
    }
}
