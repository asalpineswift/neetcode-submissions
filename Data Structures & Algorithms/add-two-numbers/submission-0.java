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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val, quo=0, rem=0;
        
        ListNode out = new ListNode();
        ListNode head = out;
        ListNode prev = null;
        while (l1 != null && l2 != null) {
            val = quo + l1.val + l2.val;
            if(val > 9){
                quo = val/10;
                rem = val%10;    
            }else{
                quo = 0;
                rem = val;
            }
            out.val = rem;
            prev = out;
            out = new ListNode();
            prev.next = out;
            l1 = l1.next;
            l2 = l2.next;
        }
        val = quo;
        if(l1 !=null){
            val += l1.val;
        }
        if(l2 !=null){
            val += l2.val;
        }
        if(val >0){
            out.val = val;
        }else{
            prev.next = null;
        }
        return head;

    }
}
