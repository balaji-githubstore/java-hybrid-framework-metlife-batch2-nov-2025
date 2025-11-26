package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import com.metlife.pages.DashboardPage;
import com.metlife.pages.LoginPage;
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

    @Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider", groups = {"regression", "smoke"})
    public void validLoginTest(String username, String password, String expectedValue) {
        LoginPage login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickOnLogin();

        //Assert the Quick Launch text
        DashboardPage dashboardPage = new DashboardPage(driver);
        String actualValue = dashboardPage.getQuickLaunchText();
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test(dataProviderClass = DataUtils.class, dataProvider = "commonDataProvider", groups = {"regression"})
    public void invalidLoginTest(String username, String password, String expectedError) {
        LoginPage login = new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickOnLogin();

        String actualError = login.getInvalidErrorMessage();
        Assert.assertEquals(actualError, expectedError);
    }
}
