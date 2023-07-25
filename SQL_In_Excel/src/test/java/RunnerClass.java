
import engine.ReaderEngine;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class RunnerClass {


    public static void main(String[] args) throws IOException {


        final ReaderEngine readerEngine = new ReaderEngine();

        Map<String, Map<String, Map<String, String>>> inputExcelData = readerEngine.readCompleteExcelUpdated("/Users/innovative/Desktop/TestDataSheet.xlsx","Row");
        Map<String, Map<String, Map<String, String>>> inputExcelDataColumn = readerEngine.readCompleteExcelUpdated("/Users/innovative/Desktop/TestDataSheet.xlsx","Column");

        System.out.println("inputExcelData "+ inputExcelData);
        System.out.println("inputExcelDataColumn "+ inputExcelDataColumn);

        System.out.println("all keys: " + inputExcelData.keySet());

        Map<String, Map<String, String>> mapOfHeaders = inputExcelData.get("Sheet1");

        System.out.println("mapOfHeaders keys "+ mapOfHeaders.keySet());

        System.out.println(getSpecificColumnAllValues(inputExcelData,"Sheet1","Name"));



    }

    public static Map<String, String> getSpecificColumnAllValues(Map<String, Map<String, Map<String, String>>> fullExcel, String sheetName, String headerName) {
        Map<String, Map<String, String>> mapOfHeaders = fullExcel.get(sheetName);
        Map<String, String> map = mapOfHeaders.get(headerName);
        return map;
    }

    // Function to convert Set<String> to String[]
    public static String[] convert(Set<String> setOfString)
    {
        // Create String[] of size of setOfString
        String[] arrayOfString = new String[setOfString.size()];
        // Copy elements from set to string array
        // using advanced for loop
        int index = 0;
        for (String str : setOfString)
            arrayOfString[index++] = str;
        // return the formed String[]
        return arrayOfString;
    }



}
