package com.magento.pages;

import com.magento.utils.BrowserActions;
import com.magento.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CreateAccount {

    // variables
    private final WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    // locators
    private final By firstName = By.id("firstname");
    private final By lastName = By.id("lastname");
    private final By email = By.id("email_address");
    private final By password = By.id("password");
    private final By confirmPassword = By.id("password-confirmation");
    private final By createAccountButton = By.xpath("// button [@class = \"action submit primary\"]");
    private final By thanksMessage = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");


    // constructor
    public CreateAccount(WebDriver driver) {
        this.driver = driver;
    }

    // actions
    public CreateAccount enterFirstName(String firstName) {
        ElementActions.sendData(driver, this.firstName, firstName);
        return this;
    }

    public CreateAccount enterLastName(String lastName) {
        ElementActions.sendData(driver, this.lastName, lastName);
        return this;
    }

    public CreateAccount enterEmail(String email) {
        ElementActions.sendData(driver, this.email, email);
        return this;
    }

    public CreateAccount enterPassword(String password) {
        ElementActions.sendData(driver, this.password, password);
        return this;
    }

    public CreateAccount enterConfirmPassword(String confirmPassword) {
        ElementActions.sendData(driver, this.confirmPassword, confirmPassword);
        return this;
    }

    public CreateAccount clickCreateAccountButton() {
        ElementActions.clickElement(driver, this.createAccountButton);
        return this;
    }

    public String getThanksMessage() {
        return driver.findElement(thanksMessage).getText();
    }

    // validation

    public CreateAccount assertAccountCreated() {
        softAssert.assertEquals(BrowserActions.getText(driver,this.thanksMessage),"Thank you for registering with Main Website Store.");
        return this;
    }
}