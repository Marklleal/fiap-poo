package br.com.fiaplibrary.main;

import br.com.fiaplibrary.model.Patron;
import br.com.fiaplibrary.model.Book;

public class MainSystem {
    public static void main(String[] args) {
        Book introductionToPython = new Book("Introduction to Python", 10, 135);
        Patron cleide = new Patron("Cleide", 0, 0, 50.0);

        System.out.println(
            cleide.getName() + " is renting the " +
            introductionToPython.getName() + " book"
        );
    }
}
