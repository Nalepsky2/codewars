package com.nalepsky.kyu7.creditCardMask;

public class Maskify {
    //https://www.codewars.com/kata/5412509bd436bd33920011bc
    public static String maskify(String str) {
        if(str.length() < 5){
            return str;
        }

        StringBuilder builder = new StringBuilder(str);
        for(int i = 0; i < str.length() - 4; i++){
            builder.setCharAt(i, '#');
        }

        return builder.toString();
    }
}
