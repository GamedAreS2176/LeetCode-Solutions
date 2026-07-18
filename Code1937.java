class Code1937
{
    public int findGCD(int[] nums)
    {
        int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(max>nums[i])
            max=nums[i];
            if(min<nums[i])
            min=nums[i];
        }
        return gcd(min,max);
    }
    int gcd(int x,int y)
    {
        while(y!=0)
        {
            int t=y;
            y=x%y;
            x=t;
        }
        return x;
    }
}