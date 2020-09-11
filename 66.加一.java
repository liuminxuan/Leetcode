/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        // java 中的数组初始值都为零
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
// @lc code=end

// java 快速初始化，填充一个数组， Arrays.fill

// import java.util.Arrays;


// public class HelloWorld {


//     public static void main(String[] args) {
//             int[] a = new int[5];

//             Arrays.fill(a, 1);

//             System.out.println(Arrays.toString(a));
//     }
// }