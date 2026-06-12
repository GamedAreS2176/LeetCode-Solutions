import java.util.*;
class Code30
{
    public List<Integer> findSubstring(String s, String[] words)
    {
        List<Integer> al=new ArrayList<>();
        int wl=0;
        if(s==null || words==null || words.length==0 || s.length()==0)
        return al;
        for(int i=0;i<words.length;i++)
        {
            wl+=words[i].length();
        }
        Arrays.sort(words);
        for(int i=0;i<=s.length()-wl;i++)
        {
            String str=s.substring(i,i+wl);
            String c[]=new String[words.length];
            for(int j=0;j<words.length;j++)
            {
                c[j]=str.substring(j*words[0].length(),(j+1)*words[0].length());
            }
            Arrays.sort(c);
            if(Arrays.equals(words,c))
            al.add(i);
        }
        return al;
    }
}