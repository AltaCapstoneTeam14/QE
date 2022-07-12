package com.example.steps;

import com.example.app.pages.DailyQuestPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dailyQuestSteps {

    LoginPage loginPage = new LoginPage();
    DailyQuestPage dailyQuestPage = new DailyQuestPage();

//    !TC 1
    @Given("I am on the homepage daily quest")
    public void iAmOnTheHomepageDailyQuest() throws InterruptedException {
        loginPage.inputFieldEmail("whale11@gmail.com");
        loginPage.inputFieldPassword("password");
        loginPage.clickButtonSignIn();
    }

    @When("I click button daily quest")
    public void iClickButtonDailyQuest() { dailyQuestPage.clickButtonDailyQuest();}

    @And("I click button claim")
    public void iClickButtonClaim() { dailyQuestPage.clickButtonClaim();}

    @And("I click button oke")
    public void iClickButtonOke() { dailyQuestPage.clickButtonOke();}

    @Then("I get result get coins")
    public void iGetResultGetCoins() { dailyQuestPage.verifyTextTakenCoins();}

//  !TC 2
    @Then("I get result taken coins today")
    public void iGetResultTakenCoinsToday() { dailyQuestPage.verifyTextTakenCoins();}


}
