package com.nalepsky.kyu5.longestCommonSubsequence;

public class Solution {
    //https://www.codewars.com/kata/52756e5ad454534f220001ef
    public static String lcs(String x, String y) {
        final StringBuilder result = new StringBuilder();
        String x1 = x;
        int j = 0;

        for (int i = 0; i < y.length(); i++) {
            if(x1.contains(String.valueOf(y.charAt(i)))){
                j = x1.indexOf(y.charAt(i));
                result.append(y.charAt(i));

                x1 = x1.substring(j + 1);
            }

            if(x1.length() == 0){
                return result.toString();
            }
        }

        return result.toString();
    }
}