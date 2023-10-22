package org.example.hw12;

public class WordFinder {
    public int maxNumberOfBalloons(String text) {
        char[] searchWord = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        int indexOfNeededLetter;
        int counter = 0;

        outer:
        while (true) {
            for (char c : searchWord) {
                indexOfNeededLetter = text.indexOf(c);
                if (indexOfNeededLetter == -1) {
                    break outer;
                }
                text = new StringBuffer(text).deleteCharAt(indexOfNeededLetter).toString();
            }
            counter++;
        }
        return counter;
    }
}
