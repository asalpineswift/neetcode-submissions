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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        n = length - n + 1;

        int count = 0;
        curr = head;
        ListNode target;
        ListNode prev = null;
        if (n == 1) {
            return head.next;
        }
        while (curr != null) {
            count++;
            if (count == n) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
