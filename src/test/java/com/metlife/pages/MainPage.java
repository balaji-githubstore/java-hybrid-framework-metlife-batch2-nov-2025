package com.metlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * All menu and common element will be handled here
 */
public class MainPage {
    private WebDriver driver = null;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnPIMMenu(){
        driver.findElement(By.xpath("")).click();
    }
}
