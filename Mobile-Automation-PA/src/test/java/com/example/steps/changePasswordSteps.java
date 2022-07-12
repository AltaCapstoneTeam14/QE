package com.example.steps;

import com.example.app.pages.ChangePasswordPage;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class changePasswordSteps {

    ChangePasswordPage changePasswordPage = new ChangePasswordPage();
    RegisterPage registerPage = new RegisterPage();

    @And("I click button change password")
    public void iClickButtonChangePassword() { changePasswordPage.clickButtonChangePassword();}

    @And("I click field {string} password")
    public void iClickFieldPassword(String password) throws InterruptedException { changePasswordPage.inputFieldPassword(password);}

    @And("I click field {string} confirm password")
    public void iClickFieldConfirmPassword(String confirmPassword) throws InterruptedException { changePasswordPage.inputFieldConfirmPassword(confirmPassword);}

    @Then("I get {string} in edit password")
    public void iGetInEditPassword(String result) {
        if (result.equals("updateSuccess")){
            changePasswordPage.verifySuccessUpdatePassword();
        }else if (result.equals("differentPassword")){
            registerPage.verifyDifferentPassword();
        }else if (result.equals("nullPassword")){
            registerPage.verifyPasswordRequired();
        }else{
            registerPage.verifyConfirmPasswordRequired();
        }
    }
}
