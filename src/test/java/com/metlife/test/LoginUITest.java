package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginUITest extends AutomationWrapper {

    @Test(groups = {"regression","smoke"})
    public void titleTest()
    {
        String actualTitle= this.driver.getTitle();
        Assert.assertEquals(actualTitle,"OrangeHRM");
    }

    @Test(groups = {"regression"})
    public void headerTest()
    {
       String actualHeader= driver.findElement(By.xpath("//h5[text()='Login']")).getText();
       Assert.assertEquals(actualHeader,"Login");
    }
}
