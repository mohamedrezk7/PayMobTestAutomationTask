package com.magento.pages;

import com.magento.utils.BrowserActions;
import com.magento.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    // variables
    private final WebDriver driver;

    // locators
    private final By createAccount = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    private final By sale = By.id("ui-id-8");
    private final By firstProduct = By.xpath("//a[contains(@class, 'product-item-link') and contains(text(), 'Radiant Tee')]");
    private final By secondProduct = By.xpath("//a[contains(@class, 'product-item-link') and contains(text(), 'Breathe-Easy Tank')]");

    // constructor
    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    //navigate To home Page
    public HomePage navigateToHomePage(){
        BrowserActions.navigateToURL(driver , "https://magento.softwaretestingboard.com/");
        return this;
    }

    // actions
    public HomePage clickCreateAccount() {
        ElementActions.clickElement(driver, this.createAccount);
        return this;
    }
    public HomePage clickSale() {
        ElementActions.clickElement(driver, this.sale);
        return this;
    }
    // navigate To Hot Seller
    public HomePage choseFirstProduct(){
        ElementActions.clickElement(driver,this.firstProduct);
        return this;
    }
    public HomePage choseSecondProduct(){
        ElementActions.clickElement(driver,this.secondProduct);
        return this;
    }

    // validation
    public HomePage assertOpenHomePage(){
        Assert.assertEquals(BrowserActions.getCurrentUrl(driver), "https://magento.softwaretestingboard.com/");
        return this;
    }
}
