package com.loanmind.service;

import com.loanmind.model.*;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public LoanResponse calculateLoan(LoanRequest request) {

        double principal = request.getPrincipal();
        double interestRate = request.getInterestRate();
        int months = request.getMonths();

        double monthlyPrincipal = principal / months;
        double remainingAmount = principal;

        List<Payment> payments = new ArrayList<>();

        double totalPayment = 0;

        for (int i = 0; i < months; i++) {

            double interest;

            if (request.getLoanType().equalsIgnoreCase("mortgage")) {

                interest = remainingAmount * interestRate / 100;

            } else {

                interest = principal * interestRate / 100;

            }

            double monthlyPayment = monthlyPrincipal + interest;

            remainingAmount -= monthlyPrincipal;

            payments.add(
                    new Payment(
                            i + 1,
                            Math.round(monthlyPayment * 100.0) / 100.0,
                            Math.round(remainingAmount * 100.0) / 100.0
                    )
            );

            totalPayment += monthlyPayment;
        }

        return new LoanResponse(
                payments,
                Math.round(totalPayment * 100.0) / 100.0
        );
    }

}