class Code1004
{
    public int longestOnes(int[] nums, int k)
    {
        int p1=0,p2=0,c=0;
        while(p2<nums.length)
        {
            if(nums[p2]==0)
            c++;
            p2++;
            if(c>k)
            {
                if(nums[p1]==0)
                c--;
                p1++;
            }
        }
        return p2-p1;
    }
}