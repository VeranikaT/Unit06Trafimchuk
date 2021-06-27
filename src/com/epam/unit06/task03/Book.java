package com.epam.unit06.task03;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;
    private String type;

    public Book(int i, String t, String a, String p, int y, int pa, double pr, String c) {
        id = i;
        title = t;
        author = a;
        publisher = p;
        year = y;
        pages = pa;
        price = pr;
        type = c;
    }

    public String toString() {
        return "[id=" + id + ", title=\"" + title + '\"' + ", authors=\"" + author + '\"' + ", publisher=\"" + publisher + '\"' + ", year=" + year + ", pages=" + pages + ", price=" + price + ", type=\"" + type + "\"]\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
       id = i;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int p) {
        pages = p;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(long p) {
        price = p;
    }

    public String getType() {
        return type;
    }

    public void setType(String c) {
        type = c;
    }
}