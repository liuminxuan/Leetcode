/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String res = "";

         for(int k = 0; k < n; k++){
             for(int i = 0; i + k < n; i++){
                 int j = i + k;

                 // 自我比较
                 if(k == 0){
                     dp[i][j] = true;
                 }

                 // 相邻比较
                 else if(k == 1){
                     dp[i][j] = (s.charAt(i) == s.charAt(j));
                 }

                 else {
                     dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i+1][j-1];
                 }

                 if(dp[i][j] == true && k + 1 > res.length()){
                     // substring结束索引不包括，所以要+1
                     res = s.substring(i, j + 1);
                 }

             }
         }
         return res;
    }
}
// @lc code=end

