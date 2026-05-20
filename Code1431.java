import java.util.*;
class Code1431
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        ArrayList<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int temp=candies[i]+extraCandies;
            if(temp>=max(candies))
            {
                result.add(true);
                continue;
            }
            result.add(false);
        }
        return result;
    }
    int max(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
}