package com.metlife.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Only for demo purpose. This class will be deleted. Don't create
 */
public class ZDemo1Test {

    @DataProvider
    public Object[][] getValidData() {
        Object[][] arr=new Object[3][2];
        //i--> number of testcase
        //j-->number of parameters
        arr[0][0]="john";
        arr[0][1]=787;

        arr[1][0]="kim";
        arr[1][1]=77;

        arr[2][0]="saul";
        arr[2][1]=88;

        return arr;
    }



    @Test(dataProvider = "getValidData")
    public void validTest(String username, int password)
    {
        System.out.println("test login"+username+"----"+password);
    }


}
