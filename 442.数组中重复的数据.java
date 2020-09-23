/*
 * @lc app=leetcode.cn id=442 lang=java
 *
 * [442] 数组中重复的数据
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // 输入输出的空间不属于额外空间，
        // 可以在输入数组中用数字的正负来表示该位置所对应数字是否已经出现过。
        // 遍历输入数组，给对应位置的数字取相反数，
        // 如果已经是负数，说明前面已经出现过，直接放入输出数组。
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int num = Math.abs(nums[i]);
            if(nums[num - 1] > 0){
                nums[num - 1] *= -1;
            }else{
                res.add(num);
            }
        }
        return res;
    }
}
// @lc code=end

