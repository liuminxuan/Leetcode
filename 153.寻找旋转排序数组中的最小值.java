/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                return nums[i];
            }else{
                continue;
            }
        }
        return nums[0];
    }
}
// @lc code=end

