/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length - 1;
        for(int i = 0; i < k; i++){
            int tmp = nums[len];
            // 因为是后面数等于前面的数，所以要从后往前看
            for(int j = len; j > 0; j--){
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}
// @lc code=end

