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
        LogsUtil.info("Data Sent" , data , "Im in the field", locator.toString());
    }

    //click
    public static void clickElement (WebDriver driver , By locator){
        //code
        Waits.waitForElementClickable(driver,locator);
        Scrolling.scrollToElement(driver , locator);
        driver.findElement(locator).click();
        LogsUtil.info("Click On the Element " ,  locator.toString());
    }
}
