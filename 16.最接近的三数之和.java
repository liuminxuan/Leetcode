/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 类似于15三数之和
        // 先排序数组
        Arrays.sort(nums);

        int len = nums.length;
        // 初始三数之和是前三个数字的和
        int sum = nums[0] + nums[1] + nums[2];
        // 初始差值
        int dis = Math.abs(sum - target);

        // 遍历数组
        for(int i = 0; i < len; i++){

            // 设置左右指针
            int L = i + 1;
            int R = len - 1;
            while(L < R){
                int tmp = nums[i] + nums[L] + nums[R];
                // 如果出现三数之和与target差值比之前小，则更新差值及和
                if(Math.abs(tmp - target) < dis){
                    sum = tmp;
                    dis = Math.abs(tmp - target);
                }
                // 因为数组已经排序完，和大了就右指针左移，小了或等于相反
                if(tmp  > target){
                    R--;
                }else{
                    L++;
                }
            }
        }
        return sum;
    }
}
// @lc code=end

