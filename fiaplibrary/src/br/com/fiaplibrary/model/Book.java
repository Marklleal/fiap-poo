package br.com.fiaplibrary.model;

public class Book {
    private String name;
    private int totalBooks;
    private int totalAvailableBooks;
    private int totalPages;

    // Declaração do Método Construtor
    public Book(String name, int totalBooks, int totalPages) {
        this.setName(name);
        this.setTotalBooks(totalBooks);
        this.setTotalAvailableBooks(totalBooks);
        this.setTotalPages(totalPages);
    }

    public void bookRental(int numBooks) {
        if (numBooks > totalAvailableBooks) {
            System.out.println("Out of stock!");
            return; // ´return´ é usado como saída no momento...
        }

        totalAvailableBooks -= numBooks;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getTotalBooks() {
        return this.totalBooks;
    }

    public void setTotalBooks(int totalBooks) {
        if (totalBooks < 0) {
            System.out.println("Não é possível haver um número negativo de livros disponíveis.\nSettado para 0!");
            this.totalBooks = 0;
        } else {
            this.totalBooks = totalBooks;
        }
    }

    public int getTotalAvailableBooks() {
        return this.totalAvailableBooks;
    }

    public void setTotalAvailableBooks(int availableBooks) {
        if (availableBooks < 0) {
            System.out.println("Não é possível existir um número negativo de livros disponíveis.\nSettado para 0!");
        } else {
            this.totalAvailableBooks = availableBooks;
        }
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        if (totalPages < 0) {
            System.out.println("Não é possível existir um número negativo de páginas.\nSettado para 0!");
        } else {
            this.totalPages = totalPages;
        }
    }
}
