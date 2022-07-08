package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class PulsaPage extends BasePageObject {

    //    *Selector
    By buttonPulsa() { return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pulsa\"]");}
    By fieldNomerTelepon() { return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");}
    By chooseOperator() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]");}
    By operatorTelkomsel() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]");}
//    By operatorIndosat() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]");}
    By providerIndosat() { return MobileBy.AccessibilityId("Indosat");}
    By nominalPulsaIndosat() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]");}
    By buttonLanjut() { return MobileBy.xpath("//android.widget.Button[@content-desc=\"Lanjut\"]");}

    //    *Validation
    By successBuyPulsa() { return MobileBy.xpath("//android.view.View[@content-desc=\"BUY PULSA SUCCESS\"]");}
    By textSelectPulsaAmount() { return MobileBy.xpath("//android.view.View[@content-desc=\"Please select the pulsa amount\"]");}
    By textEnterPhoneNumber() { return MobileBy.xpath("//android.view.View[@content-desc=\"please enter phone number\"]");}
    By textBalanceNotEnough() { return MobileBy.xpath("//android.view.View[@content-desc=\"your balance is not enough\"]");}

    public void clickButtonPulsa(){click(buttonPulsa());}
    public void inputNomerTelepon() throws InterruptedException {
        click(fieldNomerTelepon());
        sleep(150);
        click(fieldNomerTelepon());
        sendKeys(fieldNomerTelepon(),"08741528255");
    }
    public void clickChooseOperator() throws InterruptedException {
        sleep(150);
        click(chooseOperator());
    }
    public void clickOperatorTelkomsel(){ click(operatorTelkomsel());}
    public void clickProviderIndosat() throws InterruptedException {
        sleep(200);
        click(providerIndosat());}
    public void clickNominalPulsaIndosat(){ click(nominalPulsaIndosat());}
    public void clickButtonLanjut(){ click(buttonLanjut());}

    public void verifySuccessBuyPulsa(){ Assertions.assertTrue(find(successBuyPulsa()).isDisplayed());}
    public void verifySelectPulsaAmount(){ Assertions.assertTrue(find(textSelectPulsaAmount()).isDisplayed());}
    public void verifyEnterPhoneNumber(){ Assertions.assertTrue(find(textEnterPhoneNumber()).isDisplayed());}
    public void verifyBalanceNotEnough(){ Assertions.assertTrue(find(textBalanceNotEnough()).isDisplayed());}

}
