package com.magento.pages;

import com.magento.utils.BrowserActions;
import com.magento.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class MenSalePage {

    // Variables
    private final WebDriver driver ;
    SoftAssert softAssert = new SoftAssert();
    // locator
    private final By gymShortProduct = By.xpath("//a[contains(@class, 'product-item-link') and contains(text(), 'Pierce')]");
    private final By orestesFitnessShort =By.xpath("//a[contains(@class, 'product-item-link') and contains(text(), 'Fitness')]");
    private final By gymShortProductText= By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span");
    private final By orestesFitnessShortText= By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span");
    // constructor
    public MenSalePage(WebDriver driver){
        this.driver = driver;
    }
    // actions
    public MenSalePage clickOnGymShortProduct(){
        ElementActions.clickElement( driver,this.gymShortProduct);
        return this;
    };
    public MenSalePage clickOnOrestesFitnessShort(){
        ElementActions.clickElement( driver,this.orestesFitnessShort);
        return this;
    };
    //validations
    public MenSalePage assertProductPierceGymShort (){
        softAssert.assertEquals(BrowserActions.getText(driver , this.gymShortProductText),"Pierce Gym Short");
        return this;
    };
    public MenSalePage assertProductOrestesFitnessShort (){
        softAssert.assertEquals(BrowserActions.getText(driver , this.orestesFitnessShortText),"Pierce Gym Short");
        return this;
    };
}
