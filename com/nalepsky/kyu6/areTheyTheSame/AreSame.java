package com.nalepsky.kyu6.areTheyTheSame;

import java.util.*;
import java.util.stream.Collectors;

public class AreSame {
    //https://www.codewars.com/kata/550498447451fbbd7600041c
    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null){
            return false;
        }

        List<Integer> aList = Arrays.stream(a).boxed().map(i -> i*i).sorted().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().sorted().collect(Collectors.toList());

        return aList.equals(bList);
    }
}