/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        countNode(root);
        return res;
    }
    private int countNode(TreeNode root){
        if(root == null) return 0;
        // 计算左右两边的节点深度，如果发现已经大于1，就返回false
        int left = countNode(root.left) + 1;
        int right = countNode(root.right) + 1;
        if(Math.abs(right - left) > 1) {
            res = false;
        }
        return Math.max(left, right);
    }
}
// @lc code=end

