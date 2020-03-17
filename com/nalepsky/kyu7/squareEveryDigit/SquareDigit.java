package com.nalepsky.kyu7.squareEveryDigit;

import java.util.List;
import java.util.Arrays;

public class SquareDigit {

    public int squareDigits(int n) {
        final String str = Integer.toString(n);
        final StringBuilder result = new StringBuilder();
        final List<String> numbers = Arrays.asList(str.split(""));

        numbers.forEach(i -> {
            result.append(Integer.parseInt(i) * Integer.parseInt(i));
        });

        return Integer.parseInt(result.toString());
    }
}
