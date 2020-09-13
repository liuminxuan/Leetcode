/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int tail = nums.length - 1;
        for(int i = 0; i < tail; i++){
            if(nums[i] == 0){
                for(int j = i; j < tail; j++){
                    nums[j] = nums[j + 1];
                }
                nums[tail] = 0;
                tail--;
                i--; // 防止后面一个数也是0；
            }
        }
    }
}
// @lc code=end
