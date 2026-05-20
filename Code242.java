import java.util.*;
class Code242
{
    public boolean isAnagram(String s, String t)
    {
        HashMap<Character,Integer> hm2=new HashMap<>();
        HashMap<Character,Integer> hm1=new HashMap<>();
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++)
        {
            hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
        }
        for(int i=0;i<t.length();i++)
        {
            hm2.put(t.charAt(i),hm2.get(t.charAt(i))+1);
        }
        if(hm1.equals(hm2))
        return true;
        else
        return false;
    }
}