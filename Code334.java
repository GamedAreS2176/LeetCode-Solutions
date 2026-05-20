class Code334
{
    public boolean increasingTriplet(int[] nums)
    {
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=min)
            min=nums[i];
            else if(nums[i]<=smin)
            smin=nums[i];
            else
            return true;
        }
        return false;
    }
}