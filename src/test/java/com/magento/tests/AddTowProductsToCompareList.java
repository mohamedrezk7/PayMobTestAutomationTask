package com.magento.tests;

import com.magento.drivers.DriverManager;
import com.magento.pages.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class AddTowProductsToCompareList {
    //variables
    private WebDriver driver ;

    //tests
    @Test (priority = 1)
    public void successFullNavigateHomePage(){
        new HomePage(DriverManager.getDriver()).navigateToHomePage();
    }
    @Test (priority = 2)
    public void clickOnCreateAccount(){
        new HomePage(DriverManager.getDriver()).clickCreateAccount();
    }
//    @Test (priority = 3)
//    public void createAccount(){
//        new CreateAccount(driver).
//                enterFirstName("mohamed").
//                enterLastName("Rezq").
//                enterEmail("mohamed145578422884@gmail.com").
//                enterPassword("010996523mM").
//                enterConfirmPassword("010996523mM").
//                clickCreateAccountButton();
//        new HomePage(driver).
//                clickSale();
//        new SalePage(driver).
//                clickOnMenBargains().
//                assertMenSaleText();
//        new MenSalePage(driver).
//                clickOnGymShortProduct().
//                assertProductPierceGymShort();
//        new PierceGymShortPage(driver).
//                clickOnAddToCompare();
//                assertSuccessMessage();
//        new HomePage(driver).
//                clickSale();
//        new SalePage(driver).
//                clickOnMenBargains();
//        new MenSalePage(driver).
//                clickOnOrestesFitnessShort().
//                assertProductOrestesFitnessShort();
//        new OrestesFitnessShortPage(driver).
//                clickOnAddToCompare();
//                assertSuccessMessage();
//    }
    @Test (priority = 3)
    public void createAccount(){
        new CreateAccount(DriverManager.getDriver()).
                enterFirstName("mohamed").
                enterLastName("Rezq").
                enterEmail("MohamedRezq1@gmail.com").
                enterPassword("010996523mM").
                enterConfirmPassword("010996523mM").
                clickCreateAccountButton();
    }
    @Test(priority = 4)
    public void addTowProductsToCompareList(){
        new HomePage(DriverManager.getDriver()).
                navigateToHomePage().
                choseFirstProduct();
        new RadiantTeePage(DriverManager.getDriver()).
                clickOnAddToCompare();
        new HomePage(DriverManager.getDriver()).
                navigateToHomePage().
                choseSecondProduct();
        new BreatheEasyTankPage(DriverManager.getDriver()).
                clickOnAddToCompare().
                clickCompareProductButton();
    }

    //configurations
    @BeforeClass
    public void setUp(){
        //code
       driver= DriverManager.createInstance("chrome");
        new HomePage(DriverManager.getDriver()).navigateToHomePage();
    }

    @AfterClass
    public void tearDown(){
        //code
        DriverManager.getDriver().quit();
    }
}
