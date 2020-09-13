/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        if(head.next == null) return null;
        // 三指针
        ListNode pre = head; // 用于记录被消除节点前一个节点
        ListNode cur = head.next; // 记录被消除节点
        ListNode lead = head; // 探测末尾，与被消除节点相隔k节点
        // 
        for(int i = 0; i < n; i++){
            lead = lead.next;
        }
        // 当头节点是要被消除的节点的时候直接消除头节点并返回
        if(lead == null){
            dummy.next = head.next;
            return dummy.next;
        }
        // 向前勘探链表末尾
        while(lead.next != null){
            cur = cur.next;
            pre = pre.next;
            lead = lead.next;
        }
        // 消除节点
        pre.next = cur.next;
        return dummy.next;
    }
}
// @lc code=end

