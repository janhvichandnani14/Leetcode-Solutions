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
       ListNode t1=l1;
       ListNode t2=l2;
       ListNode dummyNode=new ListNode(-1);
       ListNode curr=dummyNode;
       int carry=0;


       while(t1!=null || t2!=null){
        int sum=carry;//carry gets stored before in each loop
        if(t1!=null){
            sum+=t1.val;//if list has not completed
        }
        if(t2!=null){
            sum+=t2.val;
        }
        ListNode newNode=new ListNode(sum%10);//store sum in new node
        carry=sum/10;//remove the last digit and store the rest
        curr.next=newNode;//point curr to nextnode
        curr=curr.next;//increment curr
        //increment t1 and t2 if not null
        if(t1!=null){
            t1=t1.next;
        }
        if(t2!=null){
            t2=t2.next;
        }
       }

    //last carry add at the end
       if(carry!=0){
        ListNode newNode=new ListNode(carry);
        curr.next=newNode;
       }
       return dummyNode.next;
    }
}