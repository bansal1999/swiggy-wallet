package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello wallet!");

        User user = new User("U123");
        WalletService walletService = new WalletService();

        walletService.loadMoney(user, 500, new UPI("sikhar@123"));

        boolean paid = walletService.payOrder(user, 300);

        System.out.println("Paid ? " + paid);
        System.out.println("Ramaining balance:" + user.getWallet().getBalance());

        user.getWallet().getTransactionList().forEach(System.out::println);

    }
}