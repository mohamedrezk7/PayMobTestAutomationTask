package com.magento.tests;

import com.magento.pages.HomePage;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateHomePage {
    //variables
    private WebDriver driver ;

    //tests
    @Test
    public void successFullNavigate(){
        new HomePage(driver).navigateToHomePage();
    }

    //configurations
    @BeforeMethod
    public void setUp(){
        //code
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        new HomePage(driver).navigateToHomePage();
    }

    @AfterMethod
    public void tearDown(){
        //code
        driver.quit();
    }
}
