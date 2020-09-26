/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b; // a为空直接返回b
        if(b == null || b.length() == 0) return a; // b为空直接返回a

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0) c += a.charAt(i --) - '0'; // 进位数与a相加
            if(j >= 0) c += b.charAt(j --) - '0'; // 进位数与b相加
            stb.append(c % 2);
            c >>= 1; // 移位运算
        }

        String res = stb.reverse().toString(); // 字符串反转
        return c > 0 ? '1' + res : res; //判断进位  
    }
}
// @lc code=end

