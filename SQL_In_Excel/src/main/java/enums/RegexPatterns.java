package enums;

public enum RegexPatterns {

    PATTERN_CASE1("SELECT \\* FROM (\\w+);"),
    PATTERN_CASE2("SELECT (\\w+) FROM (\\w+);"),
    PATTERN_CASE3("SELECT DISTINCT (\\w+) FROM (\\w+);"),
    PATTERN_CASE4A("SELECT \\* FROM (\\w+) WHERE (\\w+)='([^']+)';"),
    PATTERN_CASE4B("SELECT (\\w+) FROM (\\w+) WHERE (\\w+)='([^']+)';"),
    PATTERN_CASE4C("SELECT \\* FROM (\\w+) WHERE (\\w+)=(\\d+);"),
    PATTERN_CASE4D("SELECT (\\w+) FROM (\\w+) WHERE (\\w+)=(\\d+);"),
    PATTERN_CASE5A("SELECT \\* FROM (\\w+) WHERE (\\w+)='([^']+)' AND (\\w+)='([^']+)';"),
    PATTERN_CASE5B("SELECT \\* FROM (\\w+) WHERE (\\w+)='([^']+)' OR (\\w+)='([^']+)';"),
    PATTERN_CASE6("SELECT ([\\w, ]+) FROM (\\w+) WHERE (\\w+) IS NULL;"),
    PATTERN_CASE7("SELECT ([\\w, ]+) FROM (\\w+) WHERE ([\\w=]+);");


    private final String value;

    RegexPatterns(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }




}
