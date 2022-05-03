package pris.greedy;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1 || (i != 0 && flowerbed[i - 1] == 1)
                    || (i != flowerbed.length - 1 && flowerbed[i + 1] == 1)) {
                continue;
            } else {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n <= 0;
    }
}
