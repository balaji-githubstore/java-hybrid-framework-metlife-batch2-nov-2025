package com.metlife.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Only for demo purpose. This class will be deleted. Don't create
 */
public class ZDemo2Test {

    public static void main(String[] args) throws IOException {

        //location
        FileInputStream file = new FileInputStream("test-data/orange-data.xlsx");
        //open
        XSSFWorkbook book = new XSSFWorkbook(file);
        //sheet
        XSSFSheet sheet = book.getSheet("invalidLoginTest");
        int rowCount = sheet.getPhysicalNumberOfRows();
        int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] arr=new Object[rowCount-1][cellCount];

        for (int r = 1; r < rowCount; r++)
        {
            for (int c = 0; c < cellCount; c++)
            {
                String value = sheet.getRow(r).getCell(c).getStringCellValue();
                System.out.println(value);
                arr[r-1][c]=value;
            }
        }

        book.close();
        file.close();

    }

}
