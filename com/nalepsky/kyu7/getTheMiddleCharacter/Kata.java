package com.nalepsky.kyu7.getTheMiddleCharacter;

class Kata {
    //https://www.codewars.com/kata/56747fd5cb988479af000028
    public static String getMiddle(String word) {
        final int index = word.length()/2;

        if(word.length() % 2 == 0){
            return word.substring(index - 1, index + 1);
        }

        return word.charAt(index) + "";
    }
}