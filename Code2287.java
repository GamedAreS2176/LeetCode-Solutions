class Code2287
{
    public int rearrangeCharacters(String s, String target)
    {
        Map<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
        }
        Map<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<target.length();i++)
        {
            hm2.put(target.charAt(i),hm2.getOrDefault(target.charAt(i),0)+1);
        }
        int c=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> e:hm2.entrySet())
        {
            char ch=e.getKey();
            c=Math.min(c,hm1.getOrDefault(ch,0)/e.getValue());
        }
        return c;
    }
}