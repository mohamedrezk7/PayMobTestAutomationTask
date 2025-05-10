package com.magento.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Map;

public class BrowserFactory {
    public static WebDriver getBrowser(String browserName){
      switch (browserName.toLowerCase()){
          case "chrome":
              ChromeOptions options = new ChromeOptions();
              options.addArguments("--start-maximized");
              options.addArguments("--disable-extensions");
              options.addArguments("--disable-notifications");
              options.addArguments("--remote-allow-origins=*");
              return new ChromeDriver(options);
          case "firefox":
              return new FirefoxDriver();
          default:
              EdgeOptions edgeOptions = new EdgeOptions();
              edgeOptions.addArguments("--start-maximized");
              edgeOptions.addArguments("--disable-extensions");
              edgeOptions.addArguments("--disable-notifications");
              edgeOptions.addArguments("--remote-allow-origins=*");
              return new EdgeDriver(edgeOptions);
      }
    };
}
