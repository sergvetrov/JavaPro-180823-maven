package org.example.hw12;

public class JewelFinder {

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsSinglyUniq = jewels.toCharArray();
        char[] stonesSingly = stones.toCharArray();
        int counter = 0;

        for (char j : jewelsSinglyUniq) {
            for (char s : stonesSingly) {
                if (j == s) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
