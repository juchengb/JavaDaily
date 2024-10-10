package daily.day36;

// 121. Best Time to Buy and Sell Stock
public class MaxProfit {
	
	public int maxProfit(int[] prices) {
		int buy = prices[0];
		int profit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			// buy = Math.min(buy, prices[i])
			buy = (buy < prices[i]) ? buy : prices[i];
			// profit = Math.max(profit, (prices[i] - buy));
			profit = (profit > (prices[i] - buy)) ? profit : (prices[i] - buy);
		}
		return profit;
	}

}
