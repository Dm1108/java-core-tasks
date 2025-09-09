package school.sorokin.javacore.OOP.lesson5;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public abstract double withdraw(double amount);
}
