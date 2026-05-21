package com.loanmind.model;

public class Payment {

    private int month;
    private double payment;
    private double remainingDebt;

    public Payment(int month, double payment, double remainingDebt) {
        this.month = month;
        this.payment = payment;
        this.remainingDebt = remainingDebt;
    }

    public int getMonth() {
        return month;
    }

    public double getPayment() {
        return payment;
    }

    public double getRemainingDebt() {
        return remainingDebt;
    }

}