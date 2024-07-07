package daily.day58;

// 1518. Water Bottles
public class WaterBottles {

	public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        while (numBottles >= numExchange) {
            count += numExchange;
            numBottles -= numExchange;
            numBottles++;
        }
        return count + numBottles;
    }
}
