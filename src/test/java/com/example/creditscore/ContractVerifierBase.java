package com.example.creditscore;

import com.example.creditscore.controller.CreditCheckController;
import com.example.creditscore.controller.CreditCheckService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public abstract class ContractVerifierBase {

   @BeforeEach
    public void setUp() {
       RestAssuredMockMvc.standaloneSetup(new CreditCheckController(new CreditCheckService()));
   }


}
