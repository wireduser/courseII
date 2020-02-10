package com.wired.work11;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double cost;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public void viewBook() {
        System.out.println("name=" + name +
                ", author=" + author +
                ", publisher=" + publisher +
                ", year=" + year +
                ", pages=" + pages +
                ", cost=" + cost);
    }

    public Book(String name, String author,
                String publisher) {
        this(name, author, publisher, 1501, 0,
                10.0);
    }

    public Book(String name, String author,
                String publisher, int year,
                int pages, double cost) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
    }

    public Book() {
        this("name", "author", "publish",
                1501, 0, 10.0);
    }
}
