import driver.SqlInExcel;

import java.io.IOException;

/**
 * Project created on 25 July 2023
 * By Sakthivel Iyappan
 */
public class App {
    public static void main(String[] args) throws IOException {

        SqlInExcel driver = new SqlInExcel("/Users/innovative/Desktop/TestDataSheet.xlsx", "Row");
        //System.out.println(driver.getInputExcelData());
        //case:1
        //driver.executeQuery("SELECT * FROM Sheet1;");

        //case:2
        //driver.executeQuery("SELECT column FROM Sheet1;");

        //case:3
        //driver.executeQuery("SELECT DISTINCT 4565 FROM Sheet12;");

        //case:4 // for case 4: we have to cover remaining operators like <,>,=>,<=,<>,
        //driver.executeQuery("SELECT * FROM Customers WHERE Country='Mexico';");
        // driver.executeQuery("SELECT column FROM Customers WHERE Country='Mexico';");
        //driver.executeQuery("SELECT * FROM Customers WHERE CustomerID=1;");
       // driver.executeQuery("SELECT column22 FROM Customers WHERE CustomerID=1;");

        //case:5
        //driver.executeQuery("SELECT * FROM Customers WHERE Country='Germany' AND City='Berlin';");
        //driver.executeQuery("SELECT * FROM Customers WHERE City='Berlin' OR City='chennai';");
        // need to cover if column instead of *


        //case:6
        //driver.executeQuery("SELECT CustomerName, ContactName, Address FROM Customers WHERE Address IS NULL;");

        //case:7
        //driver.executeQuery("SELECT CustomerName FROM table_name WHERE ROWNUM=12;");









    }
}
