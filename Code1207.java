import java.util.*;
class Code1207
{
    public boolean uniqueOccurrences(int[] arr)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        hs.addAll(hm.values());
        return hm.size()==hs.size();
    }
}