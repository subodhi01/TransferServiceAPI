package com.example.transferapi;

import com.example.transferapi.model.Transaction;
import com.example.transferapi.service.TransferService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferServiceTest {

    //Tests a successful fund transfer between accounts.
    @Test
    public void testSuccessfulTransfer() {

        //Create an instance of TransferService
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("12345", "67890", 200.0);

        String expected = "Transfer successful.\n" +
                          "Source Account Balance: 800.0\n" +
                          "Destination Account Balance: 1700.0";
        
        //Perform the fund transfer and get the result
        String result = service.transferFunds(transaction);

        //Assert that the result matches the expected outcome
        assertEquals(expected, result);
    }

    //Tests the behavior when there are insufficient funds in the source account.
    @Test
    public void testInsufficientFunds() {
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("12345", "67890", 2000.0);

        String expected = "Insufficient funds.\n" +
                          "Source Account Balance: 1000.0"; // Expected balance when funds are insufficient
        String result = service.transferFunds(transaction);
        assertEquals(expected, result);
    }

    //Tests the behavior when an invalid account number is provided.
    @Test
    public void testInvalidAccount() {
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("00000", "67890", 100.0);

        String result = service.transferFunds(transaction);
        assertEquals("Invalid account number.", result);
    }
}

