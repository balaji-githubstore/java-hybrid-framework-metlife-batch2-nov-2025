package com.metlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private By usernameLocator = By.name("username");
    private By passwordLocator = By.name("password");
    private By loginLocator = By.xpath("//button[contains(normalize-space(),'Log')]");
    private By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");

    private WebDriver driver = null;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickOnLogin() {
        driver.findElement(loginLocator).click();
    }

    public String getInvalidErrorMessage() {
        return driver.findElement(errorLocator).getText();
    }
}
