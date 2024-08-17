package com.example.transferapi.controller;

import com.example.transferapi.model.Transaction;
import com.example.transferapi.service.TransferService;

import java.util.Scanner;

//Controller class for handling user input and initiating fund transfers.
public class TransferController {

    //Service class to handle the business logic of fund transfers
    private TransferService transferService = new TransferService();

    //Starts the application by prompting the user for input and processing the fund transfer.
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source account number:");
        String sourceAccount = scanner.nextLine();

        System.out.println("Enter destination account number:");
        String destinationAccount = scanner.nextLine();

        System.out.println("Enter amount to transfer:");
        double amount = scanner.nextDouble();

        //Create a Transaction object with the user input
        Transaction transaction = new Transaction(sourceAccount, destinationAccount, amount);

        // Process the fund transfer and get the result
        String result = transferService.transferFunds(transaction);

        System.out.println(result);
    }

    public static void main(String[] args) {

        //Create an instance of TransferController and start the application
        TransferController controller = new TransferController();
        controller.start();
    }
}
