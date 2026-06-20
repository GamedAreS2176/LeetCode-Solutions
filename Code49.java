class Code49
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String,List<String>> hm=new HashMap<>();
        for(String s:strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String ss=new String(ch);
            if(!hm.containsKey(ss))
            hm.put(ss,new ArrayList<>());
            hm.get(ss).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}