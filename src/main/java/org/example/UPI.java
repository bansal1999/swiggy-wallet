package org.example;

public class UPI implements PaymentMethod {

    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid via UPI: " + upiId);
        return true;
    }
}
