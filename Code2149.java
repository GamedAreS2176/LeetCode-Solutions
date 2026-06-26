class Code2149
{
    public int[] rearrangeArray(int[] nums)
    {
        int arr[]=new int[nums.length];
        int e=0,o=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr[2*e]=nums[i];
                e++;
            }
            else
            {
                arr[2*o+1]=nums[i];
                o++;
            }
        }
        return arr;
    }
}