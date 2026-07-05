class ProbA
{
    public boolean isMiddleElementUnique(int[] nums)
    {
        int mid=nums[nums.length/2];
        int c=0;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==mid)
                c++;
            }
        return c==1;
    }
}