package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DailyQuestPage extends BasePageObject {

//    *Selector
    By buttonDailyQuest(){ return MobileBy.xpath("//android.view.View[1]/android.widget.ScrollView[1]/android.widget.ImageView[2]");}
    By buttonClaim(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}
    By buttonOke(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}

//    *Validation
    By textTakenCoins(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[6]");}

    public void clickButtonDailyQuest(){buttonDailyQuest();}
    public void clickButtonClaim(){buttonClaim();}
    public void clickButtonOke(){buttonOke();}

    public void verifyTextTakenCoins(){ Assertions.assertTrue(find(textTakenCoins()).isDisplayed());}

}
