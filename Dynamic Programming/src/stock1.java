public class stock1 {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int profit=0;

        for(int i=0;i<prices.length;i++){
            int cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;

    }
}
