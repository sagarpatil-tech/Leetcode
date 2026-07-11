class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            // Left check
            boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);

            // Right check
            boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

            // Agar current, left aur right teeno empty hain
            if (flowerbed[i] == 0 && leftEmpty && rightEmpty) {
                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    return true;
                }
            }
        }

        return n <= 0;
    }
}