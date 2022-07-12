package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class ChangePasswordPage extends BasePageObject {


//    *Selector
    By buttonChangePassword(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]");}
    By fieldPassword(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");}
    By fieldConfirmPassword(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.EditText[2]");}
    By showPassword(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.EditText[1]/android.widget.Button[1]");}
    By showConfirmPassword(){ return MobileBy.xpath("//android.view.View/android.widget.EditText[2]/android.widget.Button");}


//    *Validation
    By successUpdatePassword(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Update password success\"]");}


    public void clickButtonChangePassword(){ click(buttonChangePassword());}
    public void inputFieldPassword(String password) throws InterruptedException {
        click(fieldPassword());
        sleep(150);
        sendKeys(fieldPassword(), password);
        click(showPassword());
    }
    public void inputFieldConfirmPassword(String confirmPassword) throws InterruptedException {
        click(fieldConfirmPassword());
        sleep(150);
        sendKeys(fieldConfirmPassword(), confirmPassword);
        click(showConfirmPassword());
    }


    public void verifySuccessUpdatePassword(){ Assertions.assertTrue(find(successUpdatePassword()).isDisplayed());}

}
