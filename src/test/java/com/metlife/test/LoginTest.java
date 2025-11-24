package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import com.metlife.utilities.DataUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends AutomationWrapper {

    @Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider",groups = {"regression","smoke"})
    public void validLoginTest(String username, String password,String expectedValue)
    {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Log')]")).click();

        //Assert the Quick Launch text
        String actualValue= driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
        Assert.assertEquals(actualValue,expectedValue);
    }

    @Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider",groups = {"regression"})
    public void invalidLoginTest(String username, String password,String expectedError)
    {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Log')]")).click();

        String actualError= driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
        Assert.assertEquals(actualError,expectedError);
    }
}
