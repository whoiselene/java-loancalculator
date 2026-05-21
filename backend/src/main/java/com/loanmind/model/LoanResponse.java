package com.loanmind.model;

import java.util.List;

public class LoanResponse {

    private List<Payment> payments;
    private double totalPayment;

    public LoanResponse(List<Payment> payments, double totalPayment) {
        this.payments = payments;
        this.totalPayment = totalPayment;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

}