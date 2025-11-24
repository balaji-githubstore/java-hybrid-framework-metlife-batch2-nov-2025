package com.metlife.utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * This class contains all the dataproviders
 */
public class DataUtils {

    @DataProvider
    public Object[][] getInvalidLoginData(){
        Object[][] arr=new Object[2][3];
        arr[0][0]="saul";
        arr[0][1]="saul123";
        arr[0][2]="Invalid credentials";

        arr[1][0]="peter";
        arr[1][1]="peter123";
        arr[1][2]="Invalid credentials";

        return arr;
    }


    @DataProvider
    public Object[][] commonDataProvider(Method mtd) throws IOException {
        //dynamically if we get @Test name - that can be passed as sheet name
        String sheetName=mtd.getName();
        Object[][] arr= ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/orange-data.xlsx",sheetName);
        return arr;
    }

}
