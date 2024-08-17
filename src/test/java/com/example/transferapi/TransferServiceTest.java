package com.example.transferapi;

import com.example.transferapi.model.Transaction;
import com.example.transferapi.service.TransferService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransferServiceTest {

    @Test
    public void testSuccessfulTransfer() {
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("12345", "67890", 200.0);

        String expected = "Transfer successful.\n" +
                          "Source Account Balance: 800.0\n" +
                          "Destination Account Balance: 1700.0";
        String result = service.transferFunds(transaction);
        assertEquals(expected, result);
    }

    @Test
    public void testInsufficientFunds() {
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("12345", "67890", 2000.0);

        String expected = "Insufficient funds.\n" +
                          "Source Account Balance: 1000.0"; // Expected balance when funds are insufficient
        String result = service.transferFunds(transaction);
        assertEquals(expected, result);
    }

    @Test
    public void testInvalidAccount() {
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("00000", "67890", 100.0);

        String result = service.transferFunds(transaction);
        assertEquals("Invalid account number.", result);
    }
}

