package com.example.steps;

import com.example.app.pages.TopupBankPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class topupBankSteps {

    TopupBankPage topupBankPage = new TopupBankPage();
    //  ! TC1
    @And("I click Bank Transfer")
    public void iClickBankTransfer() throws InterruptedException { topupBankPage.clickButtonBankTransfer();}

    @And("I click Bank BCA")
    public void iClickBankBCA() { topupBankPage.clickBCA();}

    @Then("I get the result transaction verified")
    public void iGetTheResultTransactionVerified() { topupBankPage.verifyTransactionPending();}

    //  ! TC2
    @And("I click Bank BNI")
    public void iClickBankBNI() { topupBankPage.clickBNI();}
    //  ! TC3
    @And("I click Bank BRI")
    public void iClickBankBRI() { topupBankPage.clickBRI();}
}
