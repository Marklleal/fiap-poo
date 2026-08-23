package br.com.fiapride.model;

public class Passenger {
    public String name;
    public double balance;
    public char gender;
    public int rides;
    public float stars;

    public Passenger(String name, double balance, char gender, int rides, float stars) {
        this.name = name;
        this.balance = balance;
        this.gender = gender;
        this.rides = rides;
        this.stars = stars;
    }

    public void addCash(double value) {
        // Guard Clause na prática
        if (value <= 0) {
            System.out.println("Error: The minimum value needs to be greater than 0!");
            return;
        }

        System.out.println(
            "Top-up completed! Old balance: " + this.balance +
            "\nNew Balance: " + (this.balance + value)
        );

        this.balance += value;
    }

    public void getRide(double cost) {
        if (cost <= 0) {
            System.out.println("Error: Invalid cost value!");
            return;
        }
        if (this.balance < cost) {
            System.out.println("Error: Insufficient balance. To this ride you need to add + $" + (cost - balance));
            return;
        }

        this.balance -= cost;
        System.out.println("Paid tripe\nRemaining balance: " + this.balance);
    }
}


