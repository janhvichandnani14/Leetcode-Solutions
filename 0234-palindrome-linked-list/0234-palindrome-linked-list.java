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

    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

      ListNode middle=findMiddle(head);
      ListNode secondHalfFirst=reverseList(middle.next);

    ListNode firstHalfFirst=head;
    while(secondHalfFirst!=null){
        if(firstHalfFirst.val!=secondHalfFirst.val){
            return false;
        }
        firstHalfFirst=firstHalfFirst.next;
        secondHalfFirst=secondHalfFirst.next;
    }
    return true;
    }
}