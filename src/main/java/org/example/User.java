package org.example;

public class User {
    private String userId;
    private Wallet wallet;

    public User(String userId) {
        this.userId = userId;
        this.wallet = new Wallet();
    }

    public Wallet getWallet() {
        return wallet;
    }
}
