package com.nalepsky.kyu7.disemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
