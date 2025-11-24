package com.metlife.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Only for demo purpose. This class will be deleted. Don't create
 */
public class ZDemo1Test {

    @DataProvider
    public String[][] getValidData() {
        String[][] arr=new String[3][2];
        //i--> number of testcase
        //j-->number of parameters
        arr[0][0]="john";
        arr[0][1]="john123";

        arr[1][0]="kim";
        arr[1][1]="kim123";

        arr[2][0]="saul";
        arr[2][1]="saul123";

        return arr;
    }



    @Test(dataProvider = "getValidData")
    public void validTest(String username, String password)
    {
        System.out.println("test login"+username+"----"+password);
    }


}
