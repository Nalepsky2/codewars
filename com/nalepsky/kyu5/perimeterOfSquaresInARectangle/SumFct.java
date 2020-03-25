package com.nalepsky.kyu5.perimeterOfSquaresInARectangle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SumFct {
    //https://www.codewars.com/kata/559a28007caad2ac4e000083
    public static BigInteger perimeter(BigInteger n) {
        final List<BigInteger> fib = new ArrayList<>();
        fib.add(BigInteger.ONE);
        fib.add(BigInteger.ONE);

        for (int i = 2; i < n.intValue() + 1; i++) {
            fib.add(fib.get(i-2).add(fib.get(i - 1)));
        }

        return fib.stream().reduce(BigInteger::add).get().multiply(BigInteger.valueOf(4));
    }
}