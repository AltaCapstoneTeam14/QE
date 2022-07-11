package com.example.steps;

import com.example.app.pages.CashoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cashoutSteps {

    CashoutPage cashoutPage = new CashoutPage();
//  !TC 1
    @When("I click button cashout")
    public void iClickButtonCashout() { cashoutPage.clickButtonCashout();}

    @And("I click nominal cashout")
    public void iClickNominalCashout() { cashoutPage.clickNominalCashout();}

    @And("I click button bayar")
    public void iClickButtonBayar() { cashoutPage.clickButtonBayar();}

    @Then("I get result Cashout Success")
    public void iGetResultCashoutSuccess() { cashoutPage.verifyCashoutSuccess();}

    //  !TC 2
    @Then("I get result Coin not enough")
    public void iGetResultCoinNotEnough() { cashoutPage.verifyCoinNotEnough();}

    //  !TC 3
    @Then("I get result select the cashout amount")
    public void iGetResultSelectTheCashoutAmount() { cashoutPage.verifySelectAmount();}
}
