/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        // 因为只存在买和卖两种操作，所以只考虑这两种情况
        int buy = prices[0];
        int profit = 0;
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else if(prices[i] > buy){
                profit = prices[i] - buy;
                if(profit > maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }
}
// @lc code=end

