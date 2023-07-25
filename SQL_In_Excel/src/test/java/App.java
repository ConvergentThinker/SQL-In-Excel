import driver.SqlInExcel;

import java.io.IOException;

/**
 * Project created on 25 July 2023
 * By Sakthivel Iyappan
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        SqlInExcel driver = new SqlInExcel("/Users/innovative/Desktop/TestDataSheet.xlsx","Row");

        System.out.println(driver.getInputExcelData());




    }
}
