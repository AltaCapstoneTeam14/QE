package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class LoginPage extends BasePageObject {

    //* Selector
    By textWelcome(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Hi, Welcome\"]");}
    By fieldEmail(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");}
    By fieldPassword(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[2]");}
    By buttonSignIn(){ return MobileBy.AccessibilityId("Sign In");}
    By emailInvalid(){ return MobileBy.xpath("//android.view.View[@content-desc=\"The email address is invalid\"]");}
    By lessPasswordCharacters(){ return MobileBy.xpath("//android.view.View[@content-desc=\"The length must be at least 8 characters\"]");}
    By emailRequired(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Email is Required\"]");}
    By passwordRequired(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Password is Required\"]");}
    By showPassword(){ return MobileBy.xpath("//android.widget.EditText[2]/android.widget.Button");}


    public void inputFieldEmail(String email) throws InterruptedException {
        click(fieldEmail());
        sleep(200);
        click(fieldEmail());
        sendKeys(fieldEmail(), email);
    }
    public void inputFieldPassword(String password){
        click(fieldPassword());
        sendKeys(fieldPassword(), password);
        click(showPassword());
    }
    public void clickButtonSignIn(){ click(buttonSignIn());}

    public void verifyTextWelcome(){ Assertions.assertTrue(find(textWelcome()).isDisplayed());}
    public void verifyEmailInvalid(){ Assertions.assertTrue(find(emailInvalid()).isDisplayed());}
    public void verifyLessPassword(){ Assertions.assertTrue(find(lessPasswordCharacters()).isDisplayed());}
    public void verifyEmailRequired(){ Assertions.assertTrue(find(emailRequired()).isDisplayed());}
    public void verifyPasswordRequired(){ Assertions.assertTrue(find(passwordRequired()).isDisplayed());}
}
