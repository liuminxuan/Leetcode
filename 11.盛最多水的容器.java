/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // 暴力解法
        // 每一种情况都算一遍，取出最大值
        int max = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i + 1; j < height.length; j++){
                int cur;
                // 两个距离乘较短的那块板子
                if(height[i] > height[j]){
                    cur = height[j] * (j - i);
                }else{
                    cur = height[i] * (j - i);
                }
                // 结果比max大则更新max
                if(cur > max){
                        max = cur;
                }
            }
        }
        return max;
    }
}
// @lc code=end

