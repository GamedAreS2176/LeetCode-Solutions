class Code128
{
    public int longestConsecutive(int[] nums)
    {
        if(nums.length==0)
        return 0;
        Set<Integer> hs=new HashSet<>();
        for(int n:nums)
        hs.add(n);
        int max=0;
        for(int n:hs)
        {
            if(!hs.contains(n-1))
            {
                int i=1;
                while(hs.contains(n+i))
                {
                    i++;
                }
                max=Math.max(i,max);
            }
        }
        return max;
    }
}