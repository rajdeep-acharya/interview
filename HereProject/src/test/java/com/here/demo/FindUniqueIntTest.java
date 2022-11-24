package com.here.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindUniqueIntTest {

    private FindUniqueInt target;

    @Before
    public void init() {
        target = new FindUniqueInt();
    }

    @Test
    public void testFindUniqueInt() {
        int[] intArr = {12,11,12,13,11};
        Assert.assertEquals(3, target.getFirstUnique(intArr));
    }

    @Test
    public void shouldReturnMinusOne() {
        int[] intArr = {12,11,12,12,11};
        Assert.assertEquals(-1, target.getFirstUnique(intArr));
    }
}
