package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.TopupGopayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class topupGopaySteps {

    LoginPage loginPage = new LoginPage();
    TopupGopayPage topupGopayPage = new TopupGopayPage();
    //  ! TC1
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() throws InterruptedException{
        loginPage.inputFieldEmail("whale10@gmail.com");
        loginPage.inputFieldPassword("password");
        loginPage.clickButtonSignIn();
    }

    @When("I click button topup")
    public void iClickButtonTopup() { topupGopayPage.clickButtonTopup();}

    @And("I select nominal topup")
    public void iSelectNominalTopup() { topupGopayPage.clickNominalTopup();}

    @And("I click button lanjut")
    public void iClickButtonLanjut() { topupGopayPage.clickButtonLanjut();}

    @And("I click button metode pembayaran")
    public void iClickButtonMetodePembayaran() throws InterruptedException { topupGopayPage.clickChoosePayment();}

    @And("I click Gopay")
    public void iClickGopay(){ topupGopayPage.clickGopay();}

    @And("I click bayar")
    public void iClickBayar() throws InterruptedException { topupGopayPage.clickButtonBayar();}

    @And("I input {string}")
    public void iInput(String pinCode) throws InterruptedException {
        topupGopayPage.inputPincode(pinCode);
        topupGopayPage.clickSubmitPinCode();
    }

    @Then("I get the result Transaction successfully verified")
    public void iGetTheResultTransactionSuccess() {topupGopayPage.verifySuccessTopupGopay();}
    //  ! TC2
    @Then("I get the result Please select the top up amout")
    public void iGetTheResultPleaseSelectTheTopUpAmout() { topupGopayPage.verifySelectTopupAmount();}
    //  ! TC3
    @Then("I get the result Please choose a payment method")
    public void iGetTheResultPleaseChooseAPaymentMethod() { topupGopayPage.verifySelectPaymentMethod();}
    //  ! TC4
    @Then("I get the result PIN is not valid")
    public void iGetTheResultPINIsNotValid() { topupGopayPage.verifyPinInvalid();}





}
