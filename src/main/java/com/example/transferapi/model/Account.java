package com.example.transferapi.model;

//Represents a bank account with an account number and balance.
public class Account {
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account with account number and balance.
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Returns the account number.
    public String getAccountNumber() {
        return accountNumber;
    }

    // Sets the account number.
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Returns the balance.
    public double getBalance() {
        return balance;
    }


    // Sets the balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
