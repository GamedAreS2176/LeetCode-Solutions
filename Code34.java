class Code34
{
    public int[] searchRange(int[] nums,int target)
    {
        int arr[]=new int[2];
        int first=-1,second=-1;
        //starting position
        int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        //last position
        low=0;
        high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                second=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        if(first!=-1)
        {
            arr[0]=first;
            arr[1]=second;
        }
        else
        {
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}