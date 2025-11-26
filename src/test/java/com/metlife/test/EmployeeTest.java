package com.metlife.test;

import com.metlife.base.AutomationWrapper;
import com.metlife.pages.LoginPage;
import com.metlife.utilities.DataUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmployeeTest extends AutomationWrapper {

    @Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
    public void addValidEmployeeTest(String username,String password,String firstName,String middleName,String lastName)
    {
        LoginPage login=new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickOnLogin();

        //Complete below automation work

        //click PIM menu
        //Click Add Employee
        //Enter firstName, middleName, lastName
        //Click Save

        //Assert the employee profile name
        //Assert the firstname field - firstName
    }
}
