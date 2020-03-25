package com.nalepsky.kyu5.simplePigLatin;

import java.util.Arrays;
import java.util.List;

public class PigLatin {
    //https://www.codewars.com/kata/520b9d2ad5c005041100000f
    public static String pigIt(String str) {
        List<String> words = Arrays.asList(str.split(" "));

        return words.stream()
                .map(w -> w = convert(w))
                .reduce("", (result, w) -> result + " " + w)
                .substring(1);
    }

    private static String convert(String word){
        if(!word.matches("^[a-zA-Z]*$")){
            return word;
        }

        if(word.length() == 1){
            return word + "ay";
        }

        return word.substring(1) + word.charAt(0) + "ay";
    }
}
