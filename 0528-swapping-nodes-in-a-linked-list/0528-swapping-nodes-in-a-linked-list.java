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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = head;
        ListNode dummy2 = head;
        ListNode ln = head;
        int length = 0;
        while (ln != null) {
            ln = ln.next;
            length++;
        }
        for (int i = 0; i < k - 1; i++) {
            dummy = dummy.next;
        }
        for (int i = 0; i < length - k; i++) {
            dummy2 = dummy2.next;
        }
        int temp = dummy2.val;
        dummy2.val = dummy.val;
        dummy.val = temp;
        return head;
    }
}