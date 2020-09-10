/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int tmp = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[tmp] = nums[i];
                tmp++;
            }
        }
        return tmp;
    }
}
// @lc code=end

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
// for (int i = 0; i < len; i++) {
//     print(nums[i]);
// }
// 所以即使最后数字乱七八糟也不妨碍tmp返回的长度