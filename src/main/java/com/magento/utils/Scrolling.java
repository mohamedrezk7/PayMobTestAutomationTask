package com.magento.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolling {
    private Scrolling(){

    };

    // scroll to element
    public static void scrollToElement(WebDriver driver , By locator){
        //code
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);" , driver.findElement(locator));
    }
}
