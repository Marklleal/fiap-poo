package br.com.fiaplibrary.main;

import br.com.fiaplibrary.model.Book;

public class MainSystem {
    public static void main(String[] args) {
        // Using constructor to create new objects
        Book introductionToPython = new Book("Introduction to Python", 10, 135);
        Book introductionToOOP = new Book("Introduction to OOP", 5, 407);

        // Guard clauses use
        introductionToPython.bookRental(3);
        introductionToOOP.bookRental(3);

        System.out.println("--- Fiap Library System ---");
        System.out.println("Book name: " + introductionToPython.name +
            "\nAvaible books: " + introductionToPython.totalAvailableBooks);

        System.out.println("Book name: " + introductionToOOP.name +
            "\nAvaible books: " + introductionToOOP.totalAvailableBooks);
    }
}
