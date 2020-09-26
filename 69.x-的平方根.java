/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 1) return 1;
        for(long i = 0; i <= x / 2 + 1; i++){
            if(i*i <= x && (i + 1)*(i + 1) > x){
                return (int)i;
            }
        }
        return 0;
    }
}
// @lc code=end

