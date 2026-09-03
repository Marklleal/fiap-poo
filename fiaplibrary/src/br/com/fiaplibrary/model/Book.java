package br.com.fiaplibrary.model;

public class Book {
    public String name;
    public int totalBooks;
    public int totalAvailableBooks;
    public int totalPages;

    // Constructor declaration - It's not the same that method
    public Book(String name, int totalBooks, int totalPages) {
        this.name = name;
        this.totalBooks = this.totalAvailableBooks = totalBooks;
        this.totalPages = totalPages;
    }

    public void bookRental(int numBooks) {
        if (numBooks > totalAvailableBooks) {
            System.out.println("Out of stock!");
            return; // It's our "exit" at this moment
        }

        totalAvailableBooks -= numBooks;
    }
}
