class Code1493
{
    public int longestSubarray(int[] nums)
    {
        int lw=0,c=0,start=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            c++;
            while(c>1)
            {
                if(nums[start]==0)
                c--;
                start++;
            }
            lw=Math.max(lw,i-start);
        }
        return lw;
    }
}