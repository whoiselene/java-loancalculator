package com.loanmind.controller;

import com.loanmind.model.LoanRequest;
import com.loanmind.model.LoanResponse;
import com.loanmind.service.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
@CrossOrigin(origins = "*")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/calculate")
    public LoanResponse calculateLoan(@RequestBody LoanRequest request) {

        return loanService.calculateLoan(request);

    }

}