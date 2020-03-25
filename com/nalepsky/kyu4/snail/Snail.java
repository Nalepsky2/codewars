package com.nalepsky.kyu4.snail;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    //https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1
    public static int[] snail(int[][] array) {
        final List<Integer> numbers = new ArrayList<>();
        final int n = array.length - 1;
        int layer = 0;

        if(array.length == 1){
            if(array[0].length == 1){
                final int[] result = new int[1];
                result[0] = array[0][0];
                return result;
            }
            return new int[0];
        }

        while(true){
            for (int x = layer; x <= n - layer; x++) {
                numbers.add(array[layer][x]);
            }

            if(array.length % 2 != 0 && n/2 == layer){
                break;
            }

            for (int y = layer + 1; y <= n - layer; y++) {
                numbers.add(array[y][n - layer]);
            }
            for (int x = n - layer - 1; x >= layer; x--) {
                numbers.add(array[n - layer][x]);
            }

            if(array.length % 2 == 0 && n/2 == layer){
                break;
            }

            for (int y = n - layer - 1; y >= layer + 1; y--) {
                numbers.add(array[y][layer]);
            }

            layer++;
        }

        return numbers.stream().mapToInt(i->i).toArray();
    }
}
