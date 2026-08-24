// 605. Can Place Flowers
public class D004CanPlaceFlowers {

    // Greedy（貪婪法）
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                // 判斷左邊是否為空地，若目前是第一格，視為左邊沒有鄰居，可直接種植
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                // 判斷右邊是否為空地，若目前是最後一格，視為右邊沒有鄰居，可直接種植
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeftPlot && emptyRightPlot) { // 左右兩側都沒有花，符合種植條件
                    flowerbed[i] = 1;
                    count++;

                    // Early Return，可以避免不必要的後續遍歷
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }

        // 掃描完整個花圃後仍不足 n 朵花
        return false;
    }

}
