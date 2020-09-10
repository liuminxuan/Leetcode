/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        // target比所有数小，返回0
        if(target < nums[0]){
            return 0;
        }
        // target等于最后一个数，返回最后一个数（解决数组越界问题）
        if(target == nums[nums.length - 1]){
            return nums.length - 1;
        }
        for(int i = 0; i < nums.length - 1; i++){
            // 直接等于和在两者之间两种情况
            if(nums[i] == target){
                return i;
            }
            if(nums[i] < target && nums[i+1] > target){
                return i + 1;
            }
        }
        // target 大于所有的数，返回数组长度
        return nums.length;
    }
}
// @lc code=end

