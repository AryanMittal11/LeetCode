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
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        ListNode head1 = head;
        int length = 1;
        while (head1.next != null) {
            head1 = head1.next;
            length++;
        }
        ListNode newLast = head;
        int k1 = k % length;
        int skip = length - k1;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head1.next = head;
        head = newLast.next;
        newLast.next = null;
        return head;
    }
}