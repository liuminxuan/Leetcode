/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        int half = nums.length / 2;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])+1 > half){
                    return nums[i];
                }else{
                    int tmp = map.get(nums[i]);
                    tmp++;
                    map.put(nums[i], tmp);
                }
            }else{
                map.put(nums[i], 1);
            }
        }
        return -1;
    }
}
// @lc code=end

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length / 2];
//     }
// }
