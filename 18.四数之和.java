/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for(int j = 0; j < len; j++){
            int curj = nums[j];
            // 因为已经排序好， 所以后面不可能有三个数字加和大于0，直接返回结果
            // 但是这里给的数组可能有负数，所以此优化过程注释掉
            // if(nums[j] > target) return lists;
            // 重复元素跳过
            if(j > 0 && nums[j] == nums[j-1]) continue;
            
        for(int i = j+1;i < len;++i) {
            if(i > j + 1 && nums[i] == nums[i-1]) continue;
            int curi = nums[i];
            int L = i+1, R = len-1;
            while (L < R) {
                int tmp = curj + curi + nums[L] + nums[R];
                if(tmp == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curj);
                    list.add(curi);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    // 判断下一项是否相同值，去除重复
                    while(L < R && nums[L+1] == nums[L]) ++L;
                    while(L < R && nums[R-1] == nums[R]) --R;
                    ++L;
                    --R;
                } else if(tmp < target) {
                    ++L;
                } else {
                    --R;
                }
            }
        }
        }
        return lists;
    }
}
// @lc code=end

