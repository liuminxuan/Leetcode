/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // 先把本来的总和算出来，然后把数组里的数加起来，一减就是缺失的数。
        int len = nums.length;
        int sum = (0 + len) * (len + 1) / 2;
        int subSum = 0;
        for(int i = 0; i < len; i++){
            subSum += nums[i];
        }
        return sum - subSum;
    }
}
// @lc code=end

