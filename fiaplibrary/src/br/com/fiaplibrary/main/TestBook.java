package br.com.fiaplibrary.main;

import br.com.fiaplibrary.model.Book;

public class TestBook {
    public static void main(String[] args) {
        // Using constructor to create new objects
        Book introductionToPython = new Book("Introduction to Python", 10, 135);
        Book introductionToOOP = new Book("Introduction to OOP", 5, 407);

        // Guard clauses use
        introductionToPython.bookRental(3);
        introductionToOOP.bookRental(3);

        System.out.println("--- Iniciando o Sistema FiapLibrary ---\n");
        System.out.println("Book name: " + introductionToPython.getName() +
            "\nAvaible books: " + introductionToPython.getTotalAvailableBooks());

        System.out.println("Book name: " + introductionToOOP.getName() +
            "\nAvaible books: " + introductionToOOP.getTotalAvailableBooks());
    }
}
