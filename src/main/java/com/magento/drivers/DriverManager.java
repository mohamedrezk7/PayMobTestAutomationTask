package com.magento.drivers;

import org.openqa.selenium.WebDriver;

import static org.testng.FileAssert.fail;

public class DriverManager {
    //code
    private static final ThreadLocal<WebDriver> driverThreadLocal =new ThreadLocal<>();
    private DriverManager(){
        super();
    }
    public static WebDriver createInstance(String browserName){
        WebDriver driver = BrowserFactory.getBrowser(browserName);
        setDriver(driver);
        return getDriver();
    }
    public static WebDriver getDriver(){
        if(driverThreadLocal.get()==null){
            fail("Driver Is Null");
        }
        return driverThreadLocal.get();
    }

    public static void setDriver(WebDriver driver){
        driverThreadLocal.set(driver);
    }
}
