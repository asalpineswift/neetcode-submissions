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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        return divide(lists, 0, lists.length-1);
        
    }
    public ListNode divide(ListNode[] list, int l , int r){
        if(l>r){
            return null;
        }
        if(l==r){
            return list[l];
        }
        int m = l + (r-l)/2;
        ListNode left = divide(list, l, m);
        ListNode right = divide(list, m+1, r);
        return merge(left, right);

    }

    public ListNode merge(ListNode n1, ListNode n2){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(n1 != null && n2!= null){
            if(n1.val < n2.val){
                curr.next = n1;
                n1 = n1.next;
            }else{
                curr.next = n2;
                n2 = n2.next;
            }
            curr = curr.next;
        }
        if(n1!=null){
            curr.next = n1;
        }else if(n2!=null) {
            curr.next = n2;
        }
        return head.next;
    }
}
