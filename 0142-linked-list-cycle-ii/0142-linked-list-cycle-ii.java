/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode turtle=head;
        ListNode hare=head;
     if(head==null||head.next==null){
        return null;
     }
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(turtle==hare){
                ListNode entry=head;
                  while(entry!=hare){
                    entry=entry.next;
                    hare=hare.next;
                  }  
                return entry;        
        }
        }
        return null;
    }
}