package Chap7.PP1;

import java.text.NumberFormat;

public class Account {
    private final double RATE = 0.035;
    
    private long acctNumber; 
    private double balance;
    private String name;
    
    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    public Account(String owner, long account) {
        name = owner;
        acctNumber = account;
        balance = 0.00;
    }
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
    public double withdraw(double amount, double fee) {
        balance -= (amount + fee);
        return balance;
    }
    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }
    public double getBalance() {
        return balance;
    }
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }
}