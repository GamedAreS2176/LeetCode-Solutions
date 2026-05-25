import java.util.*;
class Code2215
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        List<List<Integer>> answer=new ArrayList<>();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            hs1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            hs2.add(nums2[i]);
        }
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(Integer i:hs1)
        {
            if(!hs2.contains(i))
            l1.add(i);
        }
        for(Integer i:hs2)
        {
            if(!hs1.contains(i))
            l2.add(i);
        }
        answer.add(l1);
        answer.add(l2);
        return answer;
    }
}