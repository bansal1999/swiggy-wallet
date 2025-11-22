package org.example;

import java.util.UUID;

public class WalletService {
    public boolean loadMoney(User user, double amount, PaymentMethod method) {
        boolean result = method.pay(amount);
        Transaction txn;
        if (result) {
            user.getWallet().loadMoney(amount);
            txn = new Transaction(UUID.randomUUID().toString(), TransactionType.LOAD, amount, TransactionsStatus.SUCCESS);
        } else {
            txn = new Transaction(UUID.randomUUID().toString(), TransactionType.LOAD, amount, TransactionsStatus.FAILED);
        }
        user.getWallet().addTransaction(txn);
        return result;
    }

    public boolean payOrder(User user, double amount) {
        boolean success = user.getWallet().debit(amount);

        Transaction txn = new Transaction(
                UUID.randomUUID().toString(), TransactionType.DEBIT, amount,
                success ? TransactionsStatus.SUCCESS : TransactionsStatus.FAILED
        );

        user.getWallet().addTransaction(txn);
        return success;
    }


}
