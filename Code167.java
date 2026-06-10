class Code167
{
    public int[] twoSum(int[] numbers, int target)
    {
        int p1=0,p2=numbers.length-1;
        int ans[]=new int[2];
        while(p1<p2)
        {
            if(numbers[p1]+numbers[p2]==target)
            {
                ans[0]=p1+1;
                ans[1]=p2+1;
                break;
            }
            else if(numbers[p1]+numbers[p2]<target)
            p1++;
            else
            p2--;
        }
        return ans;
    }
}