class Code238
{
    public int[] productExceptSelf(int[] nums)
    {
        int p[]=new int[nums.length];
        int prev=1,next=1;
        for(int i=0;i<nums.length;i++)
        {
            p[i]=prev;
            prev*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            p[i]*=next;
            next*=nums[i];
        }
        return p;
    }
}