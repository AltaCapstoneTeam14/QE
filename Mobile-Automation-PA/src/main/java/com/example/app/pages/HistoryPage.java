package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class HistoryPage extends BasePageObject {

//    *Selector
    By buttonHistory(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[2]/android.widget.Button[1]");}
    By buttonDetailHistory(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ImageView[1]");}

//    *Validation
    By textDetailTransaction(){ return MobileBy.xpath("//android.view.View[1]/android.view.View[1]/android.view.View[1]");}


    public void clickButtonHistory(){click(buttonHistory());}
    public void clickButtonDetailHistory(){click(buttonDetailHistory());}

    public void verifyDetialTransaction(){ Assertions.assertTrue(find(textDetailTransaction()).isDisplayed());}


}
