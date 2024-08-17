package com.example.transferapi.model;

//Represents a fund transfer transaction between two accounts.
public class Transaction {
    private String sourceAccountNumber;
    private String destinationAccountNumber;
    private double amount;

    //Constructor to initialize a transaction with source account, destination account, and amount.
    public Transaction(String sourceAccountNumber, String destinationAccountNumber, double amount) {
        this.sourceAccountNumber = sourceAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
        this.amount = amount;
    }

    //Returns the source account number.
    public String getSourceAccountNumber() {
        return sourceAccountNumber;
    }

    //Sets the source account number.
    public void setSourceAccountNumber(String sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }

    //Returns the destination account number.
    public String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    //Sets the destination account number.
    public void setDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }

    //Returns the amount of the transaction.
    public double getAmount() {
        return amount;
    }

    //Sets the amount of the transaction.
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
