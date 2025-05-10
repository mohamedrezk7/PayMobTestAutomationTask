package com.magento.pages;

import com.magento.utils.BrowserActions;
import com.magento.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SalePage {

    // variables
    private final WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    // locators
    private final By MenBargains = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div/div[1]/a[1]/span/strong");
    private final By menSaleText = By.id("page-title-heading");
    // constructor
    public SalePage(WebDriver driver){
        this.driver =driver;
    };

    // actions
    public SalePage clickOnMenBargains(){
        ElementActions.clickElement(driver,this.MenBargains);
        return this;
    };
    // validations
    public SalePage assertMenSaleText(){
        softAssert.assertEquals(BrowserActions.getText(driver , this.menSaleText) ,"Men Sale");
        return this;
    }
}
