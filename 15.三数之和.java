/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for(int i = 0;i < len;++i) {
            // 因为已经排序好， 所以后面不可能有三个数字加和大于0，直接返回结果
            if(nums[i] > 0) return lists;
            // 重复元素跳过
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int curr = nums[i];
            int L = i+1, R = len-1;
            while (L < R) {
                int tmp = curr + nums[L] + nums[R];
                if(tmp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    // 判断下一项是否相同值，去除重复
                    while(L < R && nums[L+1] == nums[L]) ++L;
                    while(L < R && nums[R-1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if(tmp < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }
        return lists;
    }
}
// @lc code=end

// 算法流程：
// 特判，对于数组长度 nn，如果数组为 null 或者数组长度小于 3，返回 []。
// 对数组进行排序。
// 遍历排序后数组：
// 若 nums[i]>0nums[i]>0：因为已经排序好，所以后面不可能有三个数加和等于 00，直接返回结果。
// 对于重复元素：跳过，避免出现重复解
// 令左指针 L=i+1L=i+1，右指针 R=n-1R=n−1，当 L<RL<R 时，执行循环：
// 当 nums[i]+nums[L]+nums[R]==0nums[i]+nums[L]+nums[R]==0，执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,R 移到下一位置，寻找新的解
// 若和大于 00，说明 nums[R]nums[R] 太大，RR 左移
// 若和小于 00，说明 nums[L]nums[L] 太小，LL 右移
