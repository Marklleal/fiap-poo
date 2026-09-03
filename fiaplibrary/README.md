# Fiap Library

A tiny Java example library that models a very simple **book inventory system**. It is intended for teaching basic Java concepts such as packages, classes, fields, and a straightforward `main` method.

---

## Project Structure

```
fiaplibrary/
├─ src/
│  └─ br/com/fiaplibrary/
│     ├─ model/Book.java          # The domain object representing a book
│     └─ main/MainSystem.java    # Example entry point that creates two books and prints their information
├─ Book.asta                     # Astah diagram (UML) for the library model
└─ README.md                    # This documentation (English)
```

## Key Classes

### `br.com.fiaplibrary.model.Book`
```java
package br.com.fiaplibrary.model;

public class Book {
    public String name;               // The title of the book
    public int totalBooks;            // How many copies exist in the collection
    public int totalAvailableBooks;    // How many copies are currently available
    public int totalPages;            // Number of pages in the book

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
```
*All fields are public for simplicity — this is a teaching example, not production‑grade code.*

### `br.com.fiaplibrary.main.MainSystem`
```java
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
```
The **`MainSystem`** class demonstrates creating `Book` objects, setting their fields, and printing a short report.

---

## Build & Run Instructions

```bash
# From the project root (where the `src` folder lives)
# 1️⃣ Compile the source files (output goes to the default location)
javac src/br/com/fiaplibrary/model/Book.java \
      src/br/com/fiaplibrary/main/MainSystem.java

# 2️⃣ Run the program
java -cp . br.com.fiaplibrary.main.MainSystem
```

---

## Example Usage (inline snippet)
```java
Book myBook = new Book("Effective Java", 7, 350);
myBook.bookRental(2);
System.out.println(myBook.name + " – available: " + myBook.totalAvailableBooks);
```

---
