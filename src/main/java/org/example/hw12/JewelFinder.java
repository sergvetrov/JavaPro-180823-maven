package org.example.hw12;

public class JewelFinder {

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsSingly = jewels.toCharArray();
        char[] stonesSingly = stones.toCharArray();
        int counter = 0;

        for (char j : jewelsSingly) {
            for (char s : stonesSingly) {
                if (j == s) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
