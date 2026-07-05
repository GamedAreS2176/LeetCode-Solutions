class ProbB
{
    public int maxValidPairSum(int[] nums,int k)
    {
        int maxVal=nums[0],maxSum=Integer.MIN_VALUE;
        for(int i=k;i<nums.length;i++)
            {
                maxVal=Math.max(maxVal,nums[i-k]);
                maxSum=Math.max(maxSum,maxVal+nums[i]);
            }
        return maxSum;
    }
}