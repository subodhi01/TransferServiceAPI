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

        String result = service.transferFunds(transaction);
        assertEquals("Transfer successful.", result);
    }

    @Test
    public void testInsufficientFunds() {
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("12345", "67890", 2000.0);

        String result = service.transferFunds(transaction);
        assertEquals("Insufficient funds.", result);
    }

    @Test
    public void testInvalidAccount() {
        TransferService service = new TransferService();
        Transaction transaction = new Transaction("00000", "67890", 100.0);

        String result = service.transferFunds(transaction);
        assertEquals("Invalid account number.", result);
    }
}

