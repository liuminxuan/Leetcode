/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode yummy = new ListNode(-1);
        yummy.next = head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode lst = head.next.next;

        while(lst != null){
            if(cur.val == lst.val){
                
            }
        }
    }
}
// @lc code=end

