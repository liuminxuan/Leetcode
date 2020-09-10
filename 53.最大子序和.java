/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int[] dt = new int[nums.length];
        dt[0] = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            dt[i] = Math.max(dt[i - 1] + nums[i], nums[i]);
            if(dt[i] > maxSum){
                maxSum = dt[i];
            }
        }
        return maxSum;
    }
}
// @lc code=end

