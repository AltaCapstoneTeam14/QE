package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;


public class RegisterPage extends BasePageObject {

    //* Selector
    By textSignUp() { return MobileBy.xpath("//android.view.View[@content-desc=\"Sign Up\"]");}
    By fieldFullName(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");}
    By fieldEmail(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[2]");}
    By fieldPhoneNumber(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[3]");}
    By fieldPassword(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[4]");}
    By fieldConfirmPassword(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[5]");}
    By buttonSignIn() { return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]");}
    By showPassword() { return MobileBy.xpath("//android.view.View/android.view.View/android.widget.EditText[4]/android.widget.Button");}
    By showConfirmPassword() { return MobileBy.xpath("//android.view.View/android.view.View/android.widget.EditText[5]/android.widget.Button");}
    //* Selector Alert
    By emailRequired(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Email is Required\"]");}
    By phoneNumberRequired(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Phone Number is Required\"]");}
    By passwordRequired(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Password is Required\"]");}
    By confirmPasswordRequired(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Confirm Password is Required\"]");}
    By emailInvalid(){ return MobileBy.xpath("//android.view.View[@content-desc=\"The email address is invalid\"]");}
    By lessPhoneNumbers(){ return MobileBy.xpath("//android.view.View[@content-desc=\"The length must be between 10 and 18 characters\"]");}
    By lessPasswordCharacters(){ return MobileBy.xpath("//android.view.View[@content-desc=\"The length must be at least 8 characters\"]");}
    //* Selector Bottom Alert
    By successRegis(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Register success\"]");}
    By userExist(){ return MobileBy.xpath("//android.view.View[@content-desc=\"User with email user@mail.com exist\"]");}
    By differentPassword(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Password is not same\"]");}

    public void clickTextSignUp(){ click(textSignUp());}
    public void inputFieldFullName() throws InterruptedException {
        click(fieldFullName());
        sleep(200);
        click(fieldFullName());
        sendKeys(fieldFullName(), "Yuri Nathalie");
    }

    public void inputFieldEmail(String email){
        click(fieldEmail());
        sendKeys(fieldEmail(), email);
    }
    public void inputFieldPhoneNumber(String phoneNumber){
        click(fieldPhoneNumber());
        sendKeys(fieldPhoneNumber(), phoneNumber);
    }
    public void inputFieldPassword(String password){
        click(fieldPassword());
        sendKeys(fieldPassword(), password);
        click(showPassword());
    }
    public void inputFieldConfirmPassword(String confirmPassword){
        click(fieldConfirmPassword());
        sendKeys(fieldConfirmPassword(), confirmPassword);
        click(showConfirmPassword());
    }
    public void clickButtonSignUp() { click(buttonSignIn());}


    public void verifyEmailRequired(){ Assertions.assertTrue(find(emailRequired()).isDisplayed());}
    public void verifyPhoneNumberRequired(){ Assertions.assertTrue(find(phoneNumberRequired()).isDisplayed());}
    public void verifyPasswordRequired(){ Assertions.assertTrue(find(passwordRequired()).isDisplayed());}
    public void verifyConfirmPasswordRequired(){ Assertions.assertTrue(find(confirmPasswordRequired()).isDisplayed());}
    public void verifyEmailInvalid(){ Assertions.assertTrue(find(emailInvalid()).isDisplayed());}
    public void verifyPasswordCharacters(){ Assertions.assertTrue(find(lessPasswordCharacters()).isDisplayed());}
    public void verifyLessPhoneNumbers(){ Assertions.assertTrue(find(lessPhoneNumbers()).isDisplayed());}
    public void verifySuccessRegis(){ Assertions.assertTrue(find(successRegis()).isDisplayed());}
    public void verifyUserExist(){ Assertions.assertTrue(find(userExist()).isDisplayed());}
    public void verifyDifferentPassword(){ Assertions.assertTrue(find(differentPassword()).isDisplayed());}



}
