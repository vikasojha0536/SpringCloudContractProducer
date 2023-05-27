package com.example.creditscore.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCheckController {
    private final CreditCheckService creditCheckService;

    public CreditCheckController(CreditCheckService creditCheckService) {
        this.creditCheckService = creditCheckService;
    }

    @PostMapping("/credit-scores")
    public CreditCheckResponse doCreditCheck() {
        return creditCheckService.doCreditCheck();
    }
}
