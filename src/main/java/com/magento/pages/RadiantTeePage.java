package com.magento.pages;

import com.magento.utils.BrowserActions;
import com.magento.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class RadiantTeePage {
    // variables
    private final WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    // locators
    private final By addToCompare= By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[2]");
    private final By successMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");

    // constructor
    public RadiantTeePage(WebDriver driver){
        this.driver =driver;
    }
    // actions
    public RadiantTeePage clickOnAddToCompare(){
        ElementActions.clickElement(driver,this.addToCompare);
        return this;
    }
    // validations
    public RadiantTeePage assertSuccessMessage(){
        softAssert.assertEquals(BrowserActions.getText(driver,this.successMessage),"You added product Pierce Gym Short to the ");
        return this;
    }
}
