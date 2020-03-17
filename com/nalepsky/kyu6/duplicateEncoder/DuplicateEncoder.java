package com.nalepsky.kyu6.duplicateEncoder;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class DuplicateEncoder {
    //https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
    static String encode(String word){
        final StringBuilder builder = new StringBuilder();

        final Map<Character, Long> histogram = word.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        word.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .forEach(c -> {
                    if (histogram.get(c) > 1){
                        builder.append(')');
                    } else {
                        builder.append('(');
                    }
                });

        return builder.toString();
    }
}