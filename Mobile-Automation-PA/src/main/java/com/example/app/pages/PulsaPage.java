package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class PulsaPage extends BasePageObject {

    //    *Selector
    By buttonPulsa() { return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pulsa\"]");}
    By fieldNomerTelepon() { return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");}
    By chooseOperator() { return MobileBy.xpath("//android.view.View[@content-desc=\"Pilih Operator\"]");}
    By operatorTelkomsel() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[1]");}
    By operatorIndosat() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]");}
    By nominalPulsaIndosat() { return MobileBy.xpath("//android.view.View[@content-desc=\"Pulsa 20K Rp. 21000\"]");}
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
    public void clickChooseOperator(){ click(chooseOperator());}

}
