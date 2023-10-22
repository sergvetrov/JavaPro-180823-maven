package org.example.hw12;

import org.junit.Assert;
import org.junit.Test;

public class ArraysOfNumsServiceTest {
    private final ArraysOfNumsService service = new ArraysOfNumsService();

    @Test
    public void correctArray() {
        int[] nums = {1, 1, 2, 1, 3, 1, 3, 2, 1};
        int expected = 12;

        int result = service.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void arrayIsNull() {
        int[] nums = null;
        int expected = 0;

        int result = service.numIdenticalPairs(nums);
    }

    @Test
    public void oneElementInArray() {
        int[] nums = {10};
        int expected = 0;

        int result = service.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayIsEmpty() {
        int[] nums = {};
        int expected = 0;

        int result = service.numIdenticalPairs(nums);

        Assert.assertEquals(expected, result);
    }
}