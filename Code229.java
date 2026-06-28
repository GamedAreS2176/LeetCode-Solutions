class Code229
{
    public List<Integer> majorityElement(int[] nums)
    {
        List<Integer> l=new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet())
        {
            if(hm.get(i)>nums.length/3)
            l.add(i);
        }
        return l;
    }
}