/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int buy = prices[0];
        int profitSum = 0;
        // 因为只要是上升趋势最低点买最高点卖和见低就买见高就卖是一样的
        // 所以见低就买，见高就卖，卖了之后再买，后面一个低的话就买后面的，高的话就卖
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else if(prices[i] > buy){
                profitSum += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profitSum;
    }
}
// @lc code=end

