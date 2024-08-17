package com.example.transferapi.controller;

import com.example.transferapi.model.Transaction;
import com.example.transferapi.service.TransferService;

import java.util.Scanner;

public class TransferController {
    private TransferService transferService = new TransferService();

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source account number:");
        String sourceAccount = scanner.nextLine();

        System.out.println("Enter destination account number:");
        String destinationAccount = scanner.nextLine();

        System.out.println("Enter amount to transfer:");
        double amount = scanner.nextDouble();

        Transaction transaction = new Transaction(sourceAccount, destinationAccount, amount);
        String result = transferService.transferFunds(transaction);

        System.out.println(result);
    }

    public static void main(String[] args) {
        TransferController controller = new TransferController();
        controller.start();
    }
}
