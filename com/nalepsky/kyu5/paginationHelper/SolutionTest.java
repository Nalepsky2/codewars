package com.nalepsky.kyu5.paginationHelper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

        assertEquals(helper.pageCount(), 2);
        assertEquals(helper.itemCount(), 6);
        assertEquals(helper.pageItemCount(0), 4);
        assertEquals(helper.pageItemCount(1), 2);
        assertEquals(helper.pageItemCount(2), -1);

        assertEquals(helper.pageIndex(5), 1);
        assertEquals(helper.pageIndex(2), 0);
        assertEquals(helper.pageIndex(20), -1);
        assertEquals(helper.pageIndex(-10), -1);
    }
}
