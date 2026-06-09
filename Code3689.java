class Code3689
{
    public long maxTotalValue(int[] nums,int k)
    {
        int max=0,min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            max=nums[i];
            if(nums[i]<min)
            min=nums[i];
        }
        return (long)k*(max-min);
    }
}