package org.example.hw12;

import org.junit.Assert;
import org.junit.Test;

public class WordFinderTest {

    @Test
    public void correctInputWithNeededWord() {
        WordFinder finder = new WordFinder();
        String input = "loonbalxballpoon";
        int expected = 2;

        int result = finder.maxNumberOfBalloons(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void correctInputWithoutNeededWord() {
        WordFinder finder = new WordFinder();
        String input = "asdasfsdgadfsda";
        int expected = 0;

        int result = finder.maxNumberOfBalloons(input);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void inputIsEmpty() {
        WordFinder finder = new WordFinder();
        String input = "";
        int expected = 0;

        int result = finder.maxNumberOfBalloons(input);

        Assert.assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void inputIsNull() {
        WordFinder finder = new WordFinder();
        String input = null;

        int result = finder.maxNumberOfBalloons(input);
    }
}