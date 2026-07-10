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
class Code148
{
    public ListNode sortList(ListNode head)
    {
        List<Integer> al=new ArrayList<>();
        ListNode t=head;
        while(t!=null)
        {
            al.add(t.val);
            t=t.next;
        }
        Collections.sort(al);
        t=head;
        for(int i=0;i<al.size();i++)
        {
            t.val=al.get(i);
            t=t.next;
        }
        return head;
    }
}