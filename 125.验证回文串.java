/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strB = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(isNumOrAlphabet(s.charAt(i))){
                strB.append(s.charAt(i));
            }
        }
        String str = strB.toString().toLowerCase();
        for(int i = 0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public boolean isNumOrAlphabet(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }
}
// @lc code=end

