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
    public ListNode getMiddle(ListNode head){
        ListNode turtle=head;
        ListNode hare=head;
        ListNode prev=null;
        while(hare!=null && hare.next!=null){
            prev=turtle;
            turtle=turtle.next;
            hare=hare.next.next;
        }
        if(prev!=null){
            prev.next=turtle.next;
        }else{
            head=null;
        }
        return head;
    }
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)return null;
      return getMiddle(head);
    }
}