package org.example;

public class CreditCard implements PaymentMethod{
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid via card: " + cardNumber);
        return true;
    }
}
