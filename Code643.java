class Code643 
{
    public double findMaxAverage(int[] nums, int k)
    {
        double max=0.0f;
        int s=0;
        for(int i=0;i<k;i++)
        {
            s+=nums[i];
        }
        max=(double)s/k;
        for(int i=k;i<nums.length;i++)
        {
            s+=nums[i]-nums[i-k];
            if((double)s/k>max)
            max=(double)s/k;
        }
        return max;
    }
}