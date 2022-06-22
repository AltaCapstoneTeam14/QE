package com.example.steps;

import Utils.General;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerSteps {

    RegisterPage registerPage = new RegisterPage();
    General general = new General();


    @When("I click text sign up")
    public void iClickTextSignUp() { registerPage.clickTextSignUp();}

    @And("I input field fullname")
    public void iInputFieldFullname() throws InterruptedException { registerPage.inputFieldFullName(); }

    @And("I input field {string} email")
    public void iInputFieldEmail(String email) { registerPage.inputFieldEmail(email);}

    @And("I input field {string} phone number")
    public void iInputFieldPhoneNumber(String phoneNumber) { registerPage.inputFieldPhoneNumber(phoneNumber);}

    @And("I input field {string} password")
    public void iInputFieldPassword(String password) { registerPage.inputFieldPassword(password);}

    @And("I input field {string} confirm password")
    public void iInputFieldConfirmPassword(String confirmPassword) { registerPage.inputFieldConfirmPassword(confirmPassword);}

    @And("I click button sign up")
    public void iClickButtonSignUp() { registerPage.clickButtonSignUp();}

    @Then("I get {string} in register")
    public void iGetInRegister(String result) {
        if (result.equals("redirectLogin")){
            registerPage.verifySuccessRegis();
        }else if(result.equals("userExist")){
            registerPage.verifyUserExist();
        }else if(result.equals("invalidEmail")){
            registerPage.verifyEmailInvalid();
        }else if(result.equals("lessNumbers")){
            registerPage.verifyLessPhoneNumbers();
        }else if (result.equals("lessPassword")){
            registerPage.verifyPasswordCharacters();
        }else if(result.equals("differentPassword")){
            registerPage.verifyDifferentPassword();
        }else if(result.equals("nullEmail")){
            registerPage.verifyEmailRequired();
        }else if(result.equals("nullPhone")){
            registerPage.verifyPhoneNumberRequired();
        }else if (result.equals("nullPassword")){
            registerPage.verifyPasswordRequired();
        }else {
            registerPage.verifyConfirmPasswordRequired();
        }
    }
}
