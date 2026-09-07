class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int minTillNow = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(minTillNow > prices[i]){
                minTillNow = prices[i];
            }
            profit = Math.max((prices[i]-minTillNow), profit);
        }
        return profit;
    }
}
