package br.com.fiaplibrary.model;

import lombok.Getter;

@Getter 
public class Patron {
    private String name;
    private int borrowingHistory;
    private int actualBorrowing;
    private double balance;

    public Patron(String name, int borrowingHistory, int actualBorrowing, double balance) {
        this.setName(name);
        this.setBorrowingHistory(borrowingHistory);
        this.setActualBorrowing(actualBorrowing);
        this.setBalance(balance);
    }

    public int numberValidation(int value, String fieldName) {
        if (value < 0) {
            throw new IllegalArgumentException(fieldName + " must be positive!");
        }
        return value;
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be empty!");
        }
    }

    private void setBorrowingHistory(int value) {
        this.borrowingHistory = numberValidation(value, "Borrowing History");
    }

    private void setActualBorrowing(int value) {
        this.actualBorrowing = numberValidation(value, "Actual Borrowing Value");
    }

    private void setBalance(double value) {
        this.balance = numberValidation((int) value, "Account Balance");
    }
}