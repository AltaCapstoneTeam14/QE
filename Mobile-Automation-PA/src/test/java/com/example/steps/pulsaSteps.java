package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.PulsaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pulsaSteps {

    LoginPage loginPage = new LoginPage();
    PulsaPage pulsaPage = new PulsaPage();

//  ! TC1
    @When("I click button pulsa")
    public void iClickButtonPulsa() { pulsaPage.clickButtonPulsa();}

    @And("I input field nomer telepon")
    public void iInputFieldNomerTelepon() throws InterruptedException { pulsaPage.inputNomerTelepon();}

    @And("I choose operator")
    public void iChooseOperator() throws InterruptedException { pulsaPage.clickChooseOperator(); }

    @And("I click provider")
    public void iClickProvider() throws InterruptedException { pulsaPage.clickProviderIndosat();}

    @And("I click pulsa nominal")
    public void iClickPulsaNominal() { pulsaPage.clickNominalPulsaIndosat();}

    @And("I click lanjut")
    public void iClickLanjut() { pulsaPage.clickButtonLanjut();}

    @Then("I get result Buy Pulsa Success")
    public void iGetResultBuyPulsaSuccess() { pulsaPage.verifySuccessBuyPulsa();}

    //  ! TC2
    @Then("I get result please enter phone number")
    public void iGetResultPleaseEnterPhoneNumber() { pulsaPage.verifyEnterPhoneNumber();}

    //  ! TC3
    @Then("I get result please select the pulsa amount")
    public void iGetResultPleaseSelectThePulsaAmount() { pulsaPage.verifySelectPulsaAmount();}

    //  ! TC4
    @Given("I am on the homepage with no balance in the account")
    public void iAmOnTheHomepageWithNoBalanceInTheAccount() throws InterruptedException {
        loginPage.inputFieldEmail("user1@gmail.com");
        loginPage.inputFieldPassword("password");
        loginPage.clickButtonSignIn();
    }

    @Then("I get result your balance is not enough")
    public void iGetResultYourBalanceIsNotEnough() { pulsaPage.verifyBalanceNotEnough();}

    //  ! TC 5 & 6

    @And("I input field nomer telepon less numbers")
    public void iInputFieldNomerTeleponLessNumbers() throws InterruptedException { pulsaPage.inputNomerTeleponLessNumbers();}

    @And("I input field nomer telepon more than numbers")
    public void iInputFieldNomerTeleponMoreThanNumbers() throws InterruptedException { pulsaPage.inputNomerTeleponMorethanNumbers();}
}
