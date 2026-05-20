import java.util.*;
class Code645
{
    public int[] findErrorNums(int[] nums)
    {
        int arr[]=new int[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                arr[0]=nums[i];
                arr[1]=i+1;
            }
        }
        return arr;
    }
}