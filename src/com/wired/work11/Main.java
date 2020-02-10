package com.wired.work11;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book();
//        book.viewBook();
//        book.setAuthor("Shevchenko");
//        book.setYear(2010);
//        book.viewBook();
//
//        Book book1 = new Book("Title", "Ivanov",
//                "BHV");
//        book1.viewBook();
//
//        Book book2 = new Book("Cats", "Horov",
//                "PP", 2000, 327,
//                122.5);
//        book2.viewBook();

        Book[] books = createBooks();
        printBooks(books);
        updateBooks(books, 10);
        System.out.println("------------------------------------");
        printBooks(books);
        System.out.println("-------------------------------------");
        Book[] booksAuthor = searchBooksByAuthor(books,"Horov");
        printBooks(booksAuthor);

        Scanner scpub = new Scanner(System.in);
        System.out.print("Enter publisher -> ");
        String pub = scpub.nextLine();

        Book[] booksPublisher= searchBooksByPublisher(books,pub);
        System.out.println( "books by publisher - " + pub);
        printBooks(booksPublisher);

        Scanner scint = new Scanner(System.in);
        System.out.print("Enter publisher -> ");
        int year = scint.nextInt();
        Book[] booksYear = searchBooksByYear(books,year);
        printBooks(booksYear);




    }

    public static Book[] createBooks() {
        return new Book[]{
                new Book(),
                new Book("Cats", "Horov","PP"),
                new Book("Runer", "Maslo", "Word", 1999, 500, 300.0),
                new Book("Lily", "German", "BHV", 2018, 80, 487.0),
                new Book("Titan", "Dashkova", "ZQR", 2016, 540, 290.0),
                new Book("City", "Horov", "Word", 2010, 1000, 800.0),
                new Book("Run", "Shevchenko", "BHV", 1988, 1200, 255.0),
        };
    }

    public static void printBooks(Book[] books) {
        if (books.length == 0){
            System.out.println("nothing to view");
        } else {
            for (Book elem : books) {
                elem.viewBook();
            }
        }
    }

    public static void updateBooks(Book[] books, int percent) {
        for (Book elem : books) {
            double cost = elem.getCost();
            cost += cost * (percent / 100.0);
            elem.setCost(cost);
        }
    }

    public static Book[] searchBooksByAuthor(Book[] books,
                                             String name) {

        Book[] newBooks = new Book[books.length];
        int counterBooks = 0;
        for (Book elem : books) {
            if (elem.getAuthor().equalsIgnoreCase(name.trim())) {
                newBooks[counterBooks] = elem;
                counterBooks++;
            }
        }
        return Arrays.copyOf(newBooks, counterBooks);
    }

    public static Book[] searchBooksByPublisher(Book[] books, String name) {

        Book[] newBooks = new Book[books.length];
        int counterBooks = 0;
        for (Book elem : books) {
            if (elem.getPublisher().equalsIgnoreCase(name.trim())) {
                newBooks[counterBooks] = elem;
                counterBooks++;
            }
        }
        return Arrays.copyOf(newBooks, counterBooks);
    }


    public static Book[] searchBooksByYear(Book[] books, int year) {

        Book[] newBooks = new Book[books.length];
        int counterBooks = 0;
        for (Book elem : books) {
            if (elem.getYear()>= year) {
                newBooks[counterBooks] = elem;
                counterBooks++;
            }
        }
        return Arrays.copyOf(newBooks, counterBooks);
    }
}
