package leet;

public class BestTimeToBuyandSellStock {

	public static void main(String[] args) {
		int[] prices = { 7, 6, 4,3,1 };
		int maxProfit = maxProfit(prices);
		System.out.println("max profit = " + maxProfit);

	}

	public static int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}
		int maxProfit = 0;

		int cp = prices[0];
		int minCp = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if(prices[i] < cp) {
				if(prices[i] < minCp)
					minCp = prices[i];
				else {
					if(prices[i] - minCp > maxProfit)
						maxProfit = prices[i] - minCp;
				}
			} else {
				if(prices[i] - minCp > maxProfit)
					maxProfit = prices[i] - minCp;
				if(prices[i] - cp > maxProfit)
					maxProfit = prices[i] - minCp;
			}
			cp = prices[i];
				
		}

		return maxProfit;

	}

}
