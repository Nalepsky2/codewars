package com.nalepsky.kyu7.complementaryDNA;

import java.util.stream.Collectors;

public class DnaStrand {
    //https://www.codewars.com/kata/554e4a2f232cdd87d9000038
    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(c -> {
                    switch (c){
                        case "A": c = "T"; break;
                        case "T": c = "A"; break;
                        case "C": c = "G"; break;
                        case "G": c = "C"; break;
                    }
                    return c;})
                .collect(Collectors.joining());
    }
}