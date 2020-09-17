/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head == null || head.next == null) return false;
        // 快慢指针，如果是环形链表，快指针一定会领先慢指针一圈并与慢指针相等
        ListNode low = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            if(low.equals(fast)) return true;
            fast = fast.next.next;
            low = low.next;
        }
        return false;
    }
}
// @lc code=end