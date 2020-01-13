package main.java;

public class Helper {
    public String reverseLast(String str) {
        int len= str.length();

        if(len<2) return str;

        String strMinusLast2Char = str.substring(0, len-2);
        char secondLast = str.charAt(len-2);
        char Last = str.charAt(len-1);
        return strMinusLast2Char + Last + secondLast;
    }

}
