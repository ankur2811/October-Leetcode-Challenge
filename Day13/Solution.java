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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        return MergeSort(head);
    }
    
    public ListNode middle(ListNode head)
    {
         if(head==null || head.next==null)
            return head;
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    public ListNode merge(ListNode a,ListNode b)
    {
        ListNode result=null;
        if(a==null)
            return b;
        if(b==null)
            return a;
        
        if(a.val<b.val)
        {
           result=a;
            result.next=merge(a.next,b);
        }
        else
        {
            result=b;
            result.next=merge(a,b.next);
        }
        return result;
    }
    public ListNode MergeSort(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode a=middle(head);
      ListNode b=a.next;
        a.next=null;
        
        ListNode p=MergeSort(head);
        ListNode q=MergeSort(b);
        
        ListNode ans=merge(p,q);
        return ans;
        
    }
}