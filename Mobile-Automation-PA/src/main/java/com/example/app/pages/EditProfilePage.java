package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class EditProfilePage extends BasePageObject {

//    *Selector
    By buttonProfile(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[5]/android.widget.Button[1]");}
    By buttonUsername(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]");}
    By fieldName(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");}
    By fieldEmail(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.EditText[2]");}
    By fieldPhoneNumber(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.EditText[3]");}
    By buttonSimpan(){ return MobileBy.AccessibilityId("Simpan");}

//    *Validation
    By successUpdate(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Update user success\"]");}
    By phoneExist(){ return MobileBy.xpath("//android.view.View[@content-desc=\"User with phone 81888999882 exist\"]");}
    By lengthPhone(){ return MobileBy.xpath("//android.view.View[@content-desc=\"The length must be between 10 and 18 characters\"]");}

    public void clickButtonProfile(){ click(buttonProfile());}
    public void clickButtonUsername(){ click(buttonUsername());}
    public void inputFieldName(String name){
        click(fieldName());
        clear(fieldEmail());
        sendKeys(fieldName(), name);
    }
    public void inputFieldEmail(String email){
        click(fieldEmail());
        clear(fieldEmail());
        sendKeys(fieldEmail(), email);
    }
    public void inputFieldPhone(String pNumber){
        click(fieldPhoneNumber());
        clear(fieldPhoneNumber());
        sendKeys(fieldPhoneNumber(), pNumber);
    }

    public void clickButtonSimpan(){ click(buttonSimpan());}


    public void verifySuccessUpdate(){ Assertions.assertTrue(find(successUpdate()).isDisplayed());}
    public void verifyPhoneExist(){ Assertions.assertTrue(find(phoneExist()).isDisplayed());}
    public void verifyLengthPhone(){ Assertions.assertTrue(find(lengthPhone()).isDisplayed());}
}
