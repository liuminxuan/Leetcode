/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        return countNode(root);
    }
    private int countNode(TreeNode root){
        if(root == null) return 0;
        // if(root.left == null && root.right == null) return 1;
        int left = countNode(root.left);
        int right = countNode(root.right);
        // 拿 [1, 2]这个测试用例简单来看，右子树为空（那不就没有叶子节点吗），
        // 题目问的是到叶子节点的最短距离，所以就返回 左子树left + 1。
        if(root.left == null) return right + 1;
        else if(root.right == null) return left + 1;
        else return Math.min(left, right) + 1;
    }
}
// @lc code=end


// class Solution {
//     public int minDepth(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }

//         if (root.left == null && root.right == null) {
//             return 1;
//         }
//         // 深度优先搜索
//         int min_depth = Integer.MAX_VALUE;
//         if (root.left != null) {
//             min_depth = Math.min(minDepth(root.left), min_depth);
//         }
//         if (root.right != null) {
//             min_depth = Math.min(minDepth(root.right), min_depth);
//         }

//         return min_depth + 1;
//     }
// }
