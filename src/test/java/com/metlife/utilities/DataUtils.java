package com.metlife.utilities;

import org.testng.annotations.DataProvider;

/**
 * This class contains all the dataproviders
 */
public class DataUtils {
    @DataProvider
    public String[][] getInvalidLoginData(){
        String[][] arr=new String[2][3];
        arr[0][0]="saul";
        arr[0][1]="saul123";
        arr[0][2]="Invalid credentials";

        arr[1][0]="peter";
        arr[1][1]="peter123";
        arr[1][2]="Invalid credentials";

        return arr;
    }
}
