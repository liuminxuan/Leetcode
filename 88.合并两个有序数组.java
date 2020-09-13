/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        // 从后往前看，两个数组比较
        while(len1 >= 0 && len2 >= 0){
            if(nums1[len1] > nums2[len2]){
                nums1[len] = nums1[len1];
                len1--;
            }else{
                nums1[len] = nums2[len2];
                len2--;
            }
            len--;
        }
        // 将剩余数拷贝进去
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }
}
// @lc code=end

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         for(int i=m,j=0;i<n+m;++i,++j) {
//             nums1[i] = nums2[j];
//         }
//         Arrays.sort(nums1);
//     }
// }