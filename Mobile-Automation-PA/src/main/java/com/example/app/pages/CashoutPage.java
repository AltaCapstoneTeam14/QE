package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CashoutPage extends BasePageObject {

//    *Selector
    By buttonCashout(){ return MobileBy.xpath("//android.view.View[1]/android.widget.ScrollView[1]/android.widget.ImageView[4]");}
    By nominalCashout(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]");}
    By buttonLanjut(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}
    By buttonBayar(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}

//    *Validation
    By textCashoutSuccess(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[1]");}
    By selectAmount(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Please select the topup amount\"]");}
    By coinNotEnough(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Your coin is not enough\"]");}

    public void clickButtonCashout(){click(buttonCashout());}
    public void clickNominalCashout(){click(nominalCashout());}
    public void clickButtonLanjut(){click(buttonLanjut());}
    public void clickButtonBayar(){click(buttonBayar());}

    public void verifyCashoutSuccess(){ Assertions.assertTrue(find(textCashoutSuccess()).isDisplayed());}
    public void verifySelectAmount(){ Assertions.assertTrue(find(selectAmount()).isDisplayed());}
    public void verifyCoinNotEnough(){ Assertions.assertTrue(find(coinNotEnough()).isDisplayed());}
}
