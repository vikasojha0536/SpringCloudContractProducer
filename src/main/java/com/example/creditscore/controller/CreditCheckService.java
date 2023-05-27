package com.example.creditscore.controller;

import com.example.creditscore.enums.Score;
import org.springframework.stereotype.Component;

@Component
public class CreditCheckService {

    public CreditCheckResponse doCreditCheck() {
        return new CreditCheckResponse().setScore(Score.HIGH);

    }
}
