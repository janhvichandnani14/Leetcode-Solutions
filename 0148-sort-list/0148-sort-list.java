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
    public ListNode mergeList(ListNode list1,ListNode list2){
        ListNode dummyNode=new ListNode(-1);
        ListNode temp=dummyNode;
        while(list1!=null && list2!=null){
        if(list1.val<list2.val){
            temp.next=list1;
            temp=list1;
            list1=list1.next;
        }else{
            temp.next=list2;
            temp=list2;
            list2=list2.next;
        }
        }
        if(list1!=null)temp.next=list1;
        else temp.next=list2;

        return dummyNode.next;

    }
    public ListNode getMiddle(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode turtle=head;
        ListNode hare=head.next;
        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        return turtle;
    }
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null) return head;

        ListNode middle=getMiddle(head);
        ListNode righthead=middle.next;
        middle.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(righthead);
        return mergeList(left,right);

    }
}