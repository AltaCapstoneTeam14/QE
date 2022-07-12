package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {

//    *Selector
    By buttonKeluar(){ return MobileBy.AccessibilityId("Keluar");}
    By buttonLogout(){ return MobileBy.AccessibilityId("Logout");}

//    *Validation
    By textHiWelcome(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Hi, Welcome\"]");}

    public void clickButtonKeluar(){ click(buttonKeluar());}
    public void clickButtonLogout(){ click(buttonLogout());}

    public void verifyTextHiWelcome(){ Assertions.assertTrue(find(textHiWelcome()).isDisplayed());}
}
