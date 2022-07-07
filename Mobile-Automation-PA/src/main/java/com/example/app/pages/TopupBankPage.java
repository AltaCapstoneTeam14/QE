package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class TopupBankPage extends BasePageObject {


//    *Selector
    By buttonBankTransfer() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]");}
    By buttonBankBCA(){ return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ImageView[1]");}
    By buttonBankBNI(){ return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ImageView[2]");}
    By buttonBankBRI(){ return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ImageView[3]");}

//    *Validation
    By textTransactionPending(){ return MobileBy.xpath("//android.view.View[@content-desc=\"Status : pending\"]");}

    public void clickButtonBankTransfer() throws InterruptedException {
        sleep(150);
        click(buttonBankTransfer());
    }
    public void clickBCA(){click(buttonBankBCA());}
    public void clickBNI(){click(buttonBankBNI());}
    public void clickBRI(){click(buttonBankBRI());}


    public void verifyTransactionPending(){ Assertions.assertTrue(find(textTransactionPending()).isDisplayed());}


}
