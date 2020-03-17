package com.nalepsky.kyu5.scramblies;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Scramblies {
    //https://www.codewars.com/kata/55c04b4cc56a697bb0000048
    public static boolean scramble(String str1, String str2) {
        Map<Character, Long> histogram = str2.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        str1.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> {
                    if (histogram.containsKey(c)){
                        histogram.put(c, histogram.get(c) - 1);
                        if(histogram.get(c).equals(0L)){
                            histogram.remove(c);
                        }
                    }
                });

        return histogram.isEmpty();
    }
}