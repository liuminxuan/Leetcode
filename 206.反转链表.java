/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        // 使用栈的先进后出特性来来进行反转
        Stack<Integer> tmp = new Stack<Integer>();
        ListNode cur = head;
        // 压栈
        while(cur != null){
            tmp.push(cur.val);
            cur = cur.next;
        }
        ListNode newHead = new ListNode(0);
        ListNode curNode = newHead;
        while(!tmp.isEmpty()){
            // 重新根据弹栈数值来制造一个新节点
            ListNode node = new ListNode(tmp.pop());
            curNode.next = node;
            curNode = curNode.next;
        }
        return newHead.next;
    }
}
// @lc code=end

// class Solution {
//    public ListNode reverseList(ListNode head) {
//         ListNode pre = null;
//         ListNode cur = head;
//         ListNode tmp = null;
//         while (cur != null) {
//             tmp = cur.next;
//             cur.next = pre;
//             pre = cur;
//             cur = tmp;
//         }
//         return pre;
//     }
// }