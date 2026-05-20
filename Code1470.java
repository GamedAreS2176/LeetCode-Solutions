class Code1470
{
    public int[] shuffle(int[] nums, int n)
    {
        int nums1[]=new int[2*n];
        int l=0,r=n,i=0;
        for(int i=0;i<n;i++)
        {
            nums1[2*i]=nums[i];
            nums1[2*i+1]=nums[i+n];
        }
        return nums1;
    }
}