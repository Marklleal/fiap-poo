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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalBooks() {
        return this.totalBooks;
    }

    public void setTotalBooks(int total) {
        this.totalBooks = total;
    }

    public int getTotalAvailableBooks() {
        return this.totalAvailableBooks;
    }

    public void setTotalAvailableBooks(int availableBooks) {
        this.totalAvailableBooks = availableBooks;
    }
}
