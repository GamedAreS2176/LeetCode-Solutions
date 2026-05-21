import java.util.*;
class Code1679
{
    public int maxOperations(int[] nums, int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for (int v : nums) al.add(v);
        Collections.sort(al);
        int p1=0,p2=al.size()-1,c=0;
        while(al.size()>0 && p1<p2)
        {
            if(al.get(p1)+al.get(p2)==k)
            {
                c++;
                p1++;
                p2--;
            }
            else if(al.get(p1)+al.get(p2)<k)
            p1++;
            else
            p2--;
        }
        return c;
    }
}