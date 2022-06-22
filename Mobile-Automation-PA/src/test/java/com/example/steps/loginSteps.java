package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() { loginPage.verifyTextWelcome();}

    @When("I input field {string} email login")
    public void iInputFieldEmailLogin(String email) throws InterruptedException { loginPage.inputFieldEmail(email);}

    @And("I input field {string} password login")
    public void iInputFieldPasswordLogin(String password) { loginPage.inputFieldPassword(password);}

    @And("I click button sign in")
    public void iClickButtonSignIn() { loginPage.clickButtonSignIn();}

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if (result.equals("redirectHomepage")){
            loginPage.verifyTextYourBalance();
        }else if (result.equals("notRegisteredAccount")){
            loginPage.verifyNotRegistered();
        }else if (result.equals("invalidEmail")){
            loginPage.verifyEmailInvalid();
        }else if (result.equals("lessPassword")){
            loginPage.verifyLessPassword();
        }else if (result.equals("nullEmail")){
            loginPage.verifyEmailRequired();
        }else {
            loginPage.verifyPasswordRequired();
        }
    }



}
