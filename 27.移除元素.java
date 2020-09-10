/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for(int i = 0; i < k; i++){
            if(nums[i] == val){
                for(int j = i; j < k - 1; j++){
                    nums[j] = nums[j + 1];
                }
                i--;
                k--; // 因为向前移动了，末尾有一个数字必然不需要，解决超时问题
            }
        }
        return k;
    }
}
// @lc code=end

