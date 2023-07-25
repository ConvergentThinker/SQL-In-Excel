package driver;

import engine.ReaderEngine;

import java.io.IOException;
import java.util.Map;

public class SqlInExcel {

    private ReaderEngine readerEngine;
    private Map<String, Map<String, Map<String, String>>> inputExcelData;


    public SqlInExcel(String filePath, String headerDir) throws IOException {
        readerEngine = new ReaderEngine();
        inputExcelData = readerEngine.readCompleteExcelUpdated(filePath,headerDir);
    }

    public Map<String, Map<String, Map<String, String>>> getInputExcelData(){
        return inputExcelData;
    }










}
