class Code3737
{
    public int countMajoritySubarrays(int[] nums, int target)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==target)
                count++;
                if(count>(j-i+1)/2)
                c++;
            }
        }
        return c;
    }
}