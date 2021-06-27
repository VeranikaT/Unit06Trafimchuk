package com.epam.unit06.task03;

import java.util.ArrayList;

public class BookStore {
    private ArrayList<Book> store;

    public BookStore() {
        store = new ArrayList<Book>();
    }

    public void add(Book book) {
        store.add(book);
    }

    public String findByAuthor(String a) {
        StringBuffer buffer = new StringBuffer("");
        store.forEach(book -> {
            if (book.getAuthor() == a)
                buffer.append(book.toString());
        });
        return buffer.toString();
    }

    public String findByYear(int y) {
        StringBuffer buffer = new StringBuffer("");
        store.forEach(book -> {
            if (book.getYear() > y)
                buffer.append(book.toString());
        });
        return buffer.toString();
    }
}