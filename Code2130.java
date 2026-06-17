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
class Code2130
{
    public int pairSum(ListNode head)
    {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode curr=s;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first=head;
        ListNode second=prev;
        int max=0;
        while(second!=null)
        {
            max=Math.max(max,first.val+second.val);
            first=first.next;
            second=second.next;
        }
        return max;
    }
}