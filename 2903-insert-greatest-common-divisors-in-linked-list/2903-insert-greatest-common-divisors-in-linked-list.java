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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = head;
        while (dummy != null && dummy.next != null) {
            int first = dummy.val;
            int second = dummy.next.val;
            ListNode insert = new ListNode(gcd(first, second));
            insert.next = dummy.next;
            dummy.next = insert;
            dummy = dummy.next.next;            
        }
        return head;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}