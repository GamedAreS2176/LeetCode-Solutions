import java.util.*;
class Code3
{
    public int lengthOfLongestSubstring(String s)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            l=Math.max(l,hm.get(s.charAt(i))+1);
            hm.put(s.charAt(i),i);
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}