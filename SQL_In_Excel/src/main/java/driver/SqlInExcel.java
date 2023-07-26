package driver;

import engine.ReaderEngine;
import enums.RegexPatterns;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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


    public void executeQuery(String query){

        System.out.println("Find Case?"+ findPattern(query));

    }

    public String findPattern(String query){

        String caseId = "";

        HashMap<String,String> patterCases = new HashMap<>();
        patterCases.put("case1", RegexPatterns.PATTERN_CASE1.getValue());
        patterCases.put("case2", RegexPatterns.PATTERN_CASE2.getValue());
        patterCases.put("case3", RegexPatterns.PATTERN_CASE3.getValue());
        patterCases.put("case4A", RegexPatterns.PATTERN_CASE4A.getValue());
        patterCases.put("case4B", RegexPatterns.PATTERN_CASE4B.getValue());
        patterCases.put("case4C", RegexPatterns.PATTERN_CASE4C.getValue());
        patterCases.put("case4D", RegexPatterns.PATTERN_CASE4D.getValue());
        patterCases.put("case5A", RegexPatterns.PATTERN_CASE5A.getValue());
        patterCases.put("case5B", RegexPatterns.PATTERN_CASE5B.getValue());
        patterCases.put("case6", RegexPatterns.PATTERN_CASE6.getValue());
        patterCases.put("case7", RegexPatterns.PATTERN_CASE7.getValue());


        for (Map.Entry<String,String> entry:patterCases.entrySet()) {

            String regexValue = entry.getValue();
            Pattern regex = Pattern.compile(regexValue);
            Matcher matcher = regex.matcher(query);

            System.out.println("regexValue: >>>> "+ regexValue);
            System.out.println("query "+ query);

            if (matcher.find()) {

                caseId = entry.getKey(); // returns case id to next stage

                for (int i = 1; i <= matcher.groupCount(); i++) {
                    String matches = matcher.group(i);
                    System.out.println("matches: ========> "+ matches);
                }

                break;
            }else {
                System.out.println("Invalid SQL query");
            }

        }

        return caseId;
    }














}
