package com.epam.unit06.task03;

public class Main {

    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.add(new Book(1, "The Parish Boy's Progress", "Charles Dickens", "Bentley's Miscellany", 1838, 373, 25.0,"soft"));
        store.add(new Book(2, "Liza of Lambeth", " W. Somerset Maugham", "T. Fisher Unwin", 1897, 176, 65.0,"hard"));
        store.add(new Book(3, "Little Dorrit", "Charles Dickens", "Bradbury and Evans", 1857, 32, 10.0,"soft"));
        store.add(new Book(4, "The Snow Queen", "Hans Christian Andersen", "OZ", 1958, 54, 20.0,"soft"));
        store.add(new Book(5, "Barnaby Rudge", "Charles Dickens", "Chapman & Hall", 1841, 768, 50.0,"hard"));

        System.out.println("Find book(s) with author Charles Dickens.");
        System.out.println(store.findByAuthor("Charles Dickens"));
        System.out.println("Find book(s) older 1870.");
        System.out.println(store.findByYear(1870));
    }
}