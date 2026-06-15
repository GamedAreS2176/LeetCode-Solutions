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
class Code2095
{
    public ListNode deleteMiddle(ListNode head)
    {
        if(head==null||head.next==null)
        return null;
        int l=0;
        ListNode p=head;
        while(p!=null)
        {
            l++;
            p=p.next;
        }
        int i=0;
        p=head;
        while(i<l/2-1)
        {
            i++;
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }
}