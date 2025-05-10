package com.magento.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
    private BrowserActions(){

    };
    public static void navigateToURL(WebDriver driver , String url){
        driver.get(url);
    }

    // Get Current Url
    public static String getCurrentUrl(WebDriver driver ){
      return driver.getCurrentUrl();
    };

    public static String getText(WebDriver driver , By element){
        Waits.waitForElementVisible(driver , element);
        return driver.findElement(element).getText();
    }
}
