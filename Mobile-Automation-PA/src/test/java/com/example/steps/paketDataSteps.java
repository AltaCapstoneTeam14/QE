package com.example.steps;

import com.example.app.pages.PaketDataPage;
import com.example.app.pages.PulsaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paketDataSteps {

    PaketDataPage paketDataPage = new PaketDataPage();

    //  ! TC1
    @When("I click button paket data")
    public void iClickButtonPaketData() { paketDataPage.clickButtonPaketData();}

    @And("I click kuota nominal")
    public void iClickKuotaNominal() { paketDataPage.clickPaketIndosat();}

    @Then("I get result Buy Paket Data Success")
    public void iGetResultBuyPaketDataSuccess() { paketDataPage.verifySuccessBuyQuota();}

    //  ! TC3
    @Then("I get result please select the kuota amount")
    public void iGetResultPleaseSelectTheKuotaAmount() { paketDataPage.verifySelectKuotaAmout();}

    //  ! TC 5 & 6
    @Then("I get result The length of phone must be between 10 and 14 characters")
    public void iGetResultTheLengthOfPhoneMustBeBetweenAndCharacters() { paketDataPage.verifyLengthAmout();}



}
