class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price<minPrice){
                minPrice = price;
            }

            int profit = price - minPrice;

            if(profit>maximumProfit){
                maximumProfit = profit;
            }
        }

        return maximumProfit;
    }
}