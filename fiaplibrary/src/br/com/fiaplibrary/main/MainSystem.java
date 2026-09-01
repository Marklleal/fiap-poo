package br.com.fiaplibrary.main;

import br.com.fiaplibrary.model.Book;

public class MainSystem {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Introduction to Python";
        book1.totalBooks = 10;
        book1.totalAvaibleBooks = 3;

        Book book2 = new Book();
        book2.name = "Introduction to OOP";
        book2.totalBooks = 5;
        book2.totalAvaibleBooks = 3;

        System.out.println("--- Fiap Library System ---");
        System.out.println("Book name: " + book1.name +
            "\nAvaible books: " + book1.totalAvaibleBooks);
        System.out.println("Book name: " + book2.name +
            "\nAvaible books: " + book2.totalAvaibleBooks);
    }
}
