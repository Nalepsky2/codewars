package com.nalepsky.kyu5.longestCommonSubsequence;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleTests() {
        assertEquals("", Solution.lcs("a", "b"));
        assertEquals("abc", Solution.lcs("abcdef", "abc"));
        assertEquals("ac", Solution.lcs("abc", "ac"));
        assertEquals("final", Solution.lcs("zzzfinallyzzz", "finaltest"));
        assertEquals("nottest", Solution.lcs("anothertest", "notatest"));
        assertEquals("12356", Solution.lcs("132535365", "123456789"));
    }
}