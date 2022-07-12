package com.example.steps;

import com.example.app.pages.LogoutPage;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class logoutSteps {

    LogoutPage logoutPage = new LogoutPage();

    @And("I click button keluar")
    public void iClickButtonKeluar() { logoutPage.clickButtonKeluar();}

    @And("I click button logout")
    public void iClickButtonLogout() { logoutPage.clickButtonLogout();}

    @Then("I get result Redirect to login page")
    public void iGetResultRedirectToLoginPage() { logoutPage.verifyTextHiWelcome();}
}
