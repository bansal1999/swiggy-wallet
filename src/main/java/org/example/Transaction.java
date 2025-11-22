package org.example;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private TransactionType type;
    private double amount;
    private LocalDateTime time;
    private TransactionsStatus status;

    public Transaction(String id, TransactionType type, double amount, TransactionsStatus status) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", amount=" + amount +
                ", time=" + time +
                ", status=" + status +
                '}';
    }

}
