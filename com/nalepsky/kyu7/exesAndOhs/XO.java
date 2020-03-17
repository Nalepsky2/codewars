package com.nalepsky.kyu7.exesAndOhs;

public class XO {
    //https://www.codewars.com/kata/55908aad6620c066bc00002a
    public static boolean getXO (String str) {
        final Long xCount = str.toLowerCase().chars().filter(c -> c == 'x').count();
        final Long oCount = str.toLowerCase().chars().filter(c -> c == 'o').count();

        return xCount.equals(oCount);
    }
}