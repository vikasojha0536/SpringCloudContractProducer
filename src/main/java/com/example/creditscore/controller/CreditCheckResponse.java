package com.example.creditscore.controller;

import com.example.creditscore.enums.Score;

public class CreditCheckResponse {
  private Score score;

    public Score getScore() {
        return score;
    }

    public CreditCheckResponse setScore(Score score) {
        this.score = score;
        return this;
    }
}
