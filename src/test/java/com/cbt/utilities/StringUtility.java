package com.cbt.utilities;

public class StringUtility {

    public static String verifyEquals(String expected, String actual){
        String result="";
        if(expected.equalsIgnoreCase(actual))
            result="PASS";
        else
            result="FAIL";

        return result;

    }
}
