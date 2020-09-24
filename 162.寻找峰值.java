/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        // 防止指针越界
        if(nums.length < 2) return 0;
        // 左右指针
        int left = 0;
        int right = nums.length - 1;
        // 因为nums[-1]和nums[n]都为负无穷，所以如果头尾大于旁边直接返回
        if(nums[left] > nums[left + 1]) return left;
        if(nums[right] > nums[right - 1]) return right;
        // 前面开始和后面开始同时遍历
        while(left < right){
            if(nums[right - 1] > nums[right] && nums[right - 1] > nums[right - 2]){
                return right - 1;
            }
            if(nums[left + 1] > nums[left] && nums[left + 1] > nums[left + 2]){
                return left + 1;
            }
            right--;
            left++;
        }
        return 0;
    }
}
// @lc code=end

