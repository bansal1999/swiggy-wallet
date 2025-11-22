package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double balance;
    private List<Transaction> transactionList;

    public Wallet() {
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public synchronized void loadMoney(double amount){
        balance += amount;
    }

    public synchronized boolean debit(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction txn){
        transactionList.add(txn);
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }
}
