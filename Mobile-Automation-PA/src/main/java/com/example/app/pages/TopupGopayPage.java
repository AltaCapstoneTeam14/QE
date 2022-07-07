package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class TopupGopayPage extends BasePageObject {



//    *Selector
    By buttonTopup() { return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Top Up\"]");}
    By nominalTopup() { return MobileBy.xpath("//android.view.View[@content-desc=\"Rp 150000\"]");}
    By buttonLanjut() { return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lanjut\"]");}
    By buttonChoosePayment() { return MobileBy.xpath("//android.view.View[@content-desc=\"Pilih Metode Pembayaran\"]");}
    By buttonGopay() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ImageView[1]");}
    By buttonBayar() { return MobileBy.AccessibilityId("Bayar");}
    By fieldPinCode() { return MobileBy.xpath("//android.view.View[7]/android.widget.EditText");}
    By buttonSubmitPinCode() {return MobileBy.xpath("//android.view.View[6]/android.view.View[10]/android.widget.Button");}
//    * Validation
    By SuccessTopupGopay() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]");}
    By textPinInvalidGopay() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[6]/android.view.View[1]");}
    By textSelectTopupAmount() { return MobileBy.xpath("//android.view.View[@content-desc=\"Please select the topup amount\"]");}
    By textSelectPaymentMethod() { return MobileBy.xpath("//android.view.View[@content-desc=\"Please choose a payment method\"]");}


    public void clickButtonTopup(){click(buttonTopup());}
    public void clickNominalTopup(){click(nominalTopup());}
    public void clickButtonLanjut(){click(buttonLanjut());}
    public void clickChoosePayment() throws InterruptedException {
        click(buttonChoosePayment());
        sleep(150);
        click(buttonChoosePayment());}
    public void clickGopay(){ click(buttonGopay());}
    public void clickButtonBayar() {click(buttonBayar());}
    public void inputPincode(String pinCode) throws InterruptedException {
        click(fieldPinCode());
        sleep(150);
        click(fieldPinCode());
        sendKeys(fieldPinCode(), pinCode);
    }
    public void clickSubmitPinCode(){ click(buttonSubmitPinCode());}



    public void verifySuccessTopupGopay(){ Assertions.assertTrue(find(SuccessTopupGopay()).isDisplayed());}
    public void verifyPinInvalid(){ Assertions.assertTrue(find(textPinInvalidGopay()).isDisplayed());}
    public void verifySelectTopupAmount(){ Assertions.assertTrue(find(textSelectTopupAmount()).isDisplayed());}
    public void verifySelectPaymentMethod(){ Assertions.assertTrue(find(textSelectPaymentMethod()).isDisplayed());}
}
