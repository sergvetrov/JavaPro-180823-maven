package org.example.hw12;

import org.junit.Assert;
import org.junit.Test;

public class JewelFinderTest {
    private final JewelFinder finder = new JewelFinder();

    @Test
    public void expectedArguments() {
        String jewels = "aBcF";
        String stones = "jkahdAsfhdskAkBlcdjDfB";
        int expected = 4;

        int result = finder.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void jewelsIsNull() {
        String jewels = null;
        String stones = "jkahdAsfhdskAkBlcdjDfB";

        int result = finder.numJewelsInStones(jewels, stones);
    }

    @Test(expected = NullPointerException.class)
    public void stonesIsNull() {
        String jewels = "aBcF";
        String stones = null;

        int result = finder.numJewelsInStones(jewels, stones);
    }

    @Test
    public void jewelsIsEmpty() {
        String jewels = "";
        String stones = "jkahdAsfhdskAkBlcdjDfB";
        int expected = 0;

        int result = finder.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void stonesIsEmpty() {
        String jewels = "aBcF";
        String stones = "";
        int expected = 0;

        int result = finder.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }
}