package org.example.hw12;

public class JewelFinder {

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsSingly = jewels.toCharArray();
        char[] stonesSingly = stones.toCharArray();
        int counter = 0;

        for (char jewel : jewelsSingly) {
            for (char stone : stonesSingly) {
                if (jewel == stone) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
