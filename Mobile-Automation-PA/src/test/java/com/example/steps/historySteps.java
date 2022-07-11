package com.example.steps;

import com.example.app.pages.HistoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class historySteps {

    HistoryPage historyPage = new HistoryPage();

    @When("I click button history")
    public void iClickButtonHistory() { historyPage.clickButtonHistory();}

    @And("I click detail transaction history")
    public void iClickDetailTransactionHistory() { historyPage.clickButtonDetailHistory();}

    @Then("I get result Detail Transaction")
    public void iGetResultDetailTransaction() { historyPage.verifyDetialTransaction();}
}
