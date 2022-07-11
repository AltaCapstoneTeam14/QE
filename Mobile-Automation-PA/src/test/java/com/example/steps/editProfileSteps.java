package com.example.steps;

import com.example.app.pages.EditProfilePage;
import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editProfileSteps {

    EditProfilePage editProfilePage = new EditProfilePage();
    RegisterPage registerPage = new RegisterPage();

    @When("I click button profile")
    public void iClickButtonProfile() { editProfilePage.clickButtonProfile();}

    @And("I click button username")
    public void iClickButtonUsername() { editProfilePage.clickButtonUsername();}

    @And("I input field {string} name edit profile")
    public void iInputFieldNameEditProfile(String name) { editProfilePage.inputFieldName(name);}

    @And("I input field {string} email edit profile")
    public void iInputFieldEmailEditProfile(String email) { editProfilePage.inputFieldEmail(email);}

    @And("I input field {string} phone number edit profile")
    public void iInputFieldPhoneNumberEditProfile(String pNumber) { editProfilePage.inputFieldPhone(pNumber);}

    @And("I click button simpan")
    public void iClickButtonSimpan() { editProfilePage.clickButtonSimpan();}

    @Then("I get {string} in edit profile")
    public void iGetInEditProfile(String result) {
        if (result.equals("UpdateSuccess")){
            editProfilePage.verifySuccessUpdate();
        }else if(result.equals("userExist")){
            registerPage.verifyUserExist();
        }else if(result.equals("invalidEmail")){
            registerPage.verifyEmailInvalid();
        }else if(result.equals("PhoneNumberExist")){
            editProfilePage.verifyPhoneExist();
        }else if (result.equals("lengthPhone")){
            editProfilePage.verifyLengthPhone();
        }else if(result.equals("differentPassword")){
            registerPage.verifyDifferentPassword();
        }else if(result.equals("nullEmail")){
            registerPage.verifyEmailRequired();
        }else {
            registerPage.verifyPhoneNumberRequired();
        }
    }
}
