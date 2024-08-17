package com.example.transferapi.service;

import com.example.transferapi.model.Account;
import com.example.transferapi.model.Transaction;

import java.util.HashMap;
import java.util.Map;

public class TransferService {
    private Map<String, Account> accounts = new HashMap<>();

    // Initialize some accounts
    public TransferService() {
        accounts.put("12345", new Account("12345", 1000.0));
        accounts.put("67890", new Account("67890", 1500.0));
    }

    public String transferFunds(Transaction transaction) {
        Account source = accounts.get(transaction.getSourceAccountNumber());
        Account destination = accounts.get(transaction.getDestinationAccountNumber());

        if (source == null || destination == null) {
            return "Invalid account number.";
        }

        if (source.getBalance() < transaction.getAmount()) {
            return "Insufficient funds.";
        }

        source.setBalance(source.getBalance() - transaction.getAmount());
        destination.setBalance(destination.getBalance() + transaction.getAmount());

        return "Transfer successful.";
    }
}

