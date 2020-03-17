package com.nalepsky.kyu6.whichAreIn;

import java.util.*;
import java.util.stream.Collectors;

public class WhichAreIn {
    //https://www.codewars.com/kata/550554fd08b86f84fe000a58
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1).filter(s -> matches(s, array2)).sorted().toArray(String[]::new);
    }

    private static Boolean matches(String str, String[] arr){
        return Arrays.stream(arr).anyMatch(s -> s.contains(str));
    }
}
