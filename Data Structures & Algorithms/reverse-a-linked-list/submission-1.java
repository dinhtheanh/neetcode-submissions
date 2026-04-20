/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;

        ListNode newhead = reverseList(head.next);
        ListNode cur = newhead;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = head;
        head.next = null;

        return newhead;
    }
}
