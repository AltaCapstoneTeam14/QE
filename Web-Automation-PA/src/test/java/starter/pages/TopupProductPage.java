package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TopupProductPage extends PageObject {

//    *Selector
    private By buttonAddNew(){ return By.cssSelector("button[class='btn btn-success']");}
    private By fieldName(){ return By.xpath("//input[@placeholder='Name']");}
    private By fieldAmount(){ return By.xpath("//input[@placeholder='Amount']");}
    private By fieldGrossAmount(){ return By.xpath("//input[@placeholder='Gross Amount']");}
    private By buttonSubmit(){ return By.cssSelector("button[type='submit']");}
    private By buttonEdit(){ return By.xpath("(//button[@type='button'])");}
    private By buttonDelete(){ return By.xpath("(//tbody/tr[1]/td[5]/button[1]");}
    private By buttonSearch(){ return By.xpath("input[placeholder='Search . . .']");}
    private By productTopup50K(){ return By.xpath("//td[normalize-space()='TOPUP 50K']");}



//    *Validation
    private By successAddData(){ return By.xpath("//h2[normalize-space()='Top Up Product']");}
    private By failedAddData(){ return By.xpath("//h2[normalize-space()='Failed Add Data!']");}


    @Step
    public void clickAddNew(){
        $(buttonAddNew()).click();
    }
    @Step
    public void inputFieldName(String name){$(fieldName()).type(name);}
    @Step
    public void inputFieldAmount(String amount){$(fieldAmount()).type(amount);}
    @Step
    public void inputFieldGrossAmount(String grossAmount){$(fieldGrossAmount()).type(grossAmount);}
    @Step
    public void clickButtonSubmit(){
        $(buttonSubmit()).click();
    }
    @Step
    public void clickButtonEdit(){ $(buttonEdit()).click();}
    @Step
    public void clickButtonDelete(){ $(buttonDelete()).click();}
    @Step
    public void clickButtonSearch(){ $(buttonSearch()).click();}
    @Step
    public void inputFieldSearch(){ $(buttonSearch()).sendKeys("TOPUP 50K");}

//    *Equals

    @Step
    public boolean verifyAddData() { return $(successAddData()).isDisplayed();}
    @Step
    public boolean verifyAddDataEquals() { return $(successAddData()).equals("Top Up Product");}

    @Step
    public boolean verifyProduct50K() { return $(productTopup50K()).isDisplayed();}
    @Step
    public boolean verifyProduct50KEquals() { return $(productTopup50K()).equals("TOPUP 50K");}

    @Step
    public boolean verifyFailedData() { return $(failedAddData()).isDisplayed();}
    @Step
    public boolean verifyFailedDataEquals() { return $(failedAddData()).equals("Failed Add Data!");}


}
