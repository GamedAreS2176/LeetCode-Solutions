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
class Code19
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        if(head==null||head.next==null)
        return null;
        ListNode rev=revLL(head);
        if(n==1)
        rev=rev.next;
        else
        {
            ListNode p=rev;
            for(int i=0;i<n-2;i++)
            {
                p=p.next;
            }
            p.next=p.next.next;
        }
        rev=revLL(rev);
        return rev;
    }
    ListNode revLL(ListNode head)
    {
        ListNode prev=null,curr=head;
        while(curr!=null)
        {
            ListNode nodeNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nodeNext;
        }
        return prev;
    }
}