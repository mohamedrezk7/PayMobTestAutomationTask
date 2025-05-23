package com.magento.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    // present - visible - clickable
    private Waits(){

    };

     // wait for element to be present
    public static WebElement waitForElementPresent(WebDriver driver , By locator){
      //code
        LogsUtil.info("Waiting for element To Be Present" , locator.toString());
      return new WebDriverWait(driver, Duration.ofSeconds(30))
              .until(driver1 -> driver1.findElement(locator));
    };

    // wait for element to be visible
    public static WebElement waitForElementVisible(WebDriver driver , By locator){
        //code
        LogsUtil.info("Waiting for element To Be Visible" , locator.toString());
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(driver1 -> {

                   WebElement element = waitForElementPresent(driver, locator);
                   return element.isDisplayed() ? element: null;

                });
    }

    // wait for element to be clickable
    public static WebElement waitForElementClickable(WebDriver driver , By locator){
        //code
        LogsUtil.info("Waiting for element To Be Clickable" , locator.toString());
        return new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(driver1 -> {

                    WebElement element = waitForElementVisible(driver, locator);
                    return element.isEnabled() ? element: null;

                });
    }
}
