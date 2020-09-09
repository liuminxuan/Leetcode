/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            // 出现相同数字时，判断现在位置和HashMap中存的上个位置是否小于K
            if(map.get(nums[i]) != null){
                if(Math.abs(i - map.get(nums[i])) <= k){
                    return true;
                }
            }
            // 若HashMap中无相同数字则将数字和所在位置存入HashMap
            map.put(nums[i], i);
        }
        return false;
    }
}
// @lc code=end

