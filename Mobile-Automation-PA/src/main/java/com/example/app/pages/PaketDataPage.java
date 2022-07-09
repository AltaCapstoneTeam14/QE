package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


public class PaketDataPage extends BasePageObject {

//    *Selector
    By buttonPaketData() { return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Paket Data\"]");}
    By nominalPaketData(){ return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[3]/android.view.View[1]");}

//    *Validation
    By successBuyKuota() { return MobileBy.xpath("//android.view.View[@content-desc=\"BUY QUOTA SUCCESS\"]");}
    By textSelectKuotaAmount() { return MobileBy.xpath("//android.view.View[@content-desc=\"please select the pulsa amount\"]");}
    By textLengthPhone(){ return MobileBy.xpath("//android.view.View[@content-desc=\"The length of phone must be between 10 and 14 characters\"]");}


    public void clickButtonPaketData(){ click(buttonPaketData());}
    public void clickPaketIndosat(){ click(nominalPaketData()); }


    public void verifySuccessBuyQuota(){ Assertions.assertTrue(find(successBuyKuota()).isDisplayed());}
    public void verifySelectKuotaAmout(){ Assertions.assertTrue(find(textSelectKuotaAmount()).isDisplayed());}
    public void verifyLengthAmout(){ Assertions.assertTrue(find(textLengthPhone()).isDisplayed());}
}
