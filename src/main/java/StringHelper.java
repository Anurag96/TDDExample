package main.java;

public class StringHelper {

    public String removeAInFirst2Chars(String str) {

        if (str.length() < 2) return str.replaceAll("A", "");
        String first2Char = str.substring(0, 2);
        String afterFirst2Char = str.substring(2);
        return first2Char.replaceAll("A", "") + afterFirst2Char;
    }

    public int AdditionofNumber(int a,int b){
        int c= a+b;
        return c;
    }

    public int SquareOfNumber(int a){
        int c=a*a;
        return c;
    }
}
