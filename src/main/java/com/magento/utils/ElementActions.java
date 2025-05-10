package com.magento.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementActions {
    private ElementActions(){

    };

    // send Keys

    public static void sendData (WebDriver driver , By locator , String data){
        //code
        Waits.waitForElementVisible(driver,locator);
        Scrolling.scrollToElement(driver , locator);
        driver.findElement(locator).sendKeys(data);
    }

    //click
    public static void clickElement (WebDriver driver , By locator){
        //code
        Waits.waitForElementClickable(driver,locator);
        Scrolling.scrollToElement(driver , locator);
        driver.findElement(locator).click();
    }
}
