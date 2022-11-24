package com.here.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindUniqueStringTest {

    private FindUniqueString target;

    @Before
    public void init() {
        target = new FindUniqueString();
    }

    @Test
    public void testFindUniqueString() {
        String str = "abbacd";
        Assert.assertEquals(4, target.getFirstUnique(str));
    }

    @Test
    public void shouldReturnMinusOne() {
        String str = "abbaba";
        Assert.assertEquals(-1, target.getFirstUnique(str));
    }
}
