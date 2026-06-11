class Code209
{
    public int minSubArrayLen(int target,int[] nums)
    {
        int s=0,k=0,ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            while(s>=target)
            {
                ans=Math.min(ans,i-k+1);
                s-=nums[k++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}