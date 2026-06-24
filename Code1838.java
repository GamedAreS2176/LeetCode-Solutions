class Code1838
{
    public int maxFrequency(int[] nums,int k)
    {
        int f=0,idx=0;
        long s=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            while(s+k<(long)nums[i]*(i-idx+1))
            {
                s-=nums[idx];
                idx++;
            }
            f=Math.max(f,i-idx+1);
        }
        return f;
    }
}